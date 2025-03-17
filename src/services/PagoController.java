/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author juanp
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import ui.PagoForm;
import ui.CriptoForm;
import domain.Pago;
import domain.payment.PagoTarjeta;
import domain.payment.PagoPayPal;
import domain.payment.PagoCripto;
import exceptions.OperacionInvalidaException;
import exceptions.PaymentException;
import ui.PaypalForm;
import java.lang.Math;

public class PagoController {

    private PagoForm formularioPagos;
    private CriptoForm criptoForm;
    private PaypalForm paypalForm;
    private Pago paymentStrategy;
    public PagoController() {
        this.createPaymentForm();
    }

    private String generatePaymentId(String paymentType) {
        StringBuilder sb = new StringBuilder();
        sb.append(paymentType).append("-");
        sb.append(Double.toString(Math.random() * 1000000));
        return sb.toString();
    }

    private double validateNumericField() throws OperacionInvalidaException {
        double saldoTransaccion = 0;
        try {
            getPaymentFormTransactionAmmountCampText();
        } catch (Exception e) {
            throw new OperacionInvalidaException("INGRESE UN VALOR NUMERICO");
        }
        if (saldoTransaccion <= 0) {
            throw new OperacionInvalidaException("POR FAVOR INGRESE UN VALOR MAYOR A 0");
        }
        return saldoTransaccion;
    }

    private double getPaymentFormTransactionAmmountCampText(){
        return Double.parseDouble(this.formularioPagos.getMontoTransaccionField().getText());

    }

    private String getPaymentFormAccountCampText() {
        return this.formularioPagos.getCuentaDestinoField().getText();
    }

    private boolean validateTextCamp() {
        try {
            double saldo = validateNumericField();
        } catch (OperacionInvalidaException e) {
            this.formularioPagos.getLabelError().setText(e.getMessage());
            return false;
        }
        this.formularioPagos.getLabelError().setText(null);
        return true;
    }

    private void createPaymentForm() {
        this.formularioPagos = new PagoForm();
        this.formularioPagos.showWindow();
        this.formularioPagos.addCardPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.addCriptoPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.addPaypalPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.showWindow();
    }

    private void createCriptoForm() {
        this.criptoForm = new CriptoForm();
        this.criptoForm.addPaymentButtonClickListener(new ButtonClickListener());
        this.criptoForm.showWindow();

    }

    private void createPaypalForm() {
        this.paypalForm = new PaypalForm();
        this.paypalForm.addPaymentButtonClickListener(new ButtonClickListener());
        this.paypalForm.showWindow();
    }

    private boolean handlePayment(Pago paymentStrategy, JLabel errorLabel) {
        try {
            this.paymentStrategy.pagar();
        } catch (PaymentException e) {
            errorLabel.setText(e.getMessage());
            return false;
        }
        errorLabel.setText(null);
        return true;
    }

    /*
        private Pago buildPayment(){
        
    }
     */
    private class ButtonClickListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            JPanel src = (JPanel) e.getSource();
            if (src == formularioPagos.getCardPanel()) {
                if (validateTextCamp()) {
                    paymentStrategy = new PagoTarjeta();
                }
            }
            if (src == formularioPagos.getPaypalPanel()) {
                if (validateTextCamp()) {
                    paymentStrategy = new PagoPayPal();
                    createPaypalForm();
                }

            }
            if (src == formularioPagos.getCriptoPanel()) {
                if (validateTextCamp()) {
                    createCriptoForm();
                }

            }
            if (criptoForm != null) {
                /*
                if (src == criptoForm.getPaymentButton()){
                    PagoCripto payment = new PagoCripto.Builder().idPago(paymentStrategy.getIdPago())
                            .cuentaDestino(paymentStrategy.getCuentaDestino())
                            .montoTransaccion(paymentStrategy.getMontoTransaccion())
                            .walletPasskeyAttempt(new String(criptoForm.getWalletPasskey().getPassword()))
                            .walletTransactionTokenAttempt(criptoForm.getWalletToken().getText())
                            */
                            
                    if (handlePayment(paymentStrategy, criptoForm.getErrorLabel())){
                        criptoForm.dispose();
                        paymentStrategy = null;
                    }
                }
            }
        }

    }
}

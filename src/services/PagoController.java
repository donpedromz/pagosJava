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
import ui.PaypalForm;
import ui.CardForm;
import domain.Pago;
import domain.account.*;
import domain.payment.PagoTarjeta;
import domain.payment.PagoPayPal;
import domain.payment.PagoCripto;
import exceptions.OperacionInvalidaException;
import exceptions.PaymentException;
import java.lang.Math;
import javax.swing.JTextField;

public class PagoController {

    private PagoForm formularioPagos;
    private CriptoForm criptoForm;
    private PaypalForm paypalForm;
    private CardForm cardForm;
    private Pago paymentStrategy;
    private GestorCuentas gestor;

    public PagoController() {
        this.gestor = new GestorCuentas();
        this.createPaymentForm();
    }

    public PagoController(GestorCuentas gestor) {
        this.gestor = gestor;
        this.createPaymentForm();
    }

    private String generatePaymentId(String paymentType) {
        StringBuilder sb = new StringBuilder();
        sb.append(paymentType).append("-");
        sb.append(Double.toString(Math.random() * 1000000));
        return sb.toString();
    }

    /*
    private double validateNumericField(JTextField textField) throws OperacionInvalidaException {
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
     */
    private void createPaymentForm() {
        this.formularioPagos = new PagoForm();
        this.formularioPagos.showWindow();
        this.formularioPagos.addCardPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.addCriptoPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.addPaypalPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.showWindow();
    }

    private void createCardForm() {
        this.cardForm = new CardForm();
        this.cardForm.addPaymentButtonClickListener(new ButtonClickListener());
        this.cardForm.showWindow();
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
    private double getDoubleFromTextField(JTextField field) throws OperacionInvalidaException {
        double ammount = 0;
        try {
            ammount = Double.parseDouble(field.getText());
        } catch (Exception e) {
            throw new OperacionInvalidaException("INGRESE UN VALOR NUMERICO");
        }
        if (ammount <= 0) {
            throw new OperacionInvalidaException("POR FAVOR INGRESE UN PAGO MAYOR A 0");
        }
        return ammount;
    }

    private class ButtonClickListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            JPanel src = (JPanel) e.getSource();
            if (src == formularioPagos.getCardPanel()) {
                createCardForm();
            }
            if (src == formularioPagos.getPaypalPanel()) {
                createPaypalForm();
            }
            if (src == formularioPagos.getCriptoPanel()) {
                createCriptoForm();
            }
            if (criptoForm != null) {
                if (src == criptoForm.getPaymentButton()) {
                    try {
                        Cuenta origen = gestor.buscarCuenta(criptoForm.getWalletNumber().getText());
                        double montoTransaccion = getDoubleFromTextField(criptoForm.getTransactionAmmount());
                    } catch (OperacionInvalidaException exception) {
                        criptoForm.getErrorLabel().setText(exception.getMessage());
                    }
                    if (handlePayment(paymentStrategy, criptoForm.getErrorLabel())) {
                        criptoForm.dispose();
                        paymentStrategy = null;
                    }
                }
            }
        }
    }
}

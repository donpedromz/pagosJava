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
import ui.PagoForm;
import ui.CriptoForm;
import domain.Pago;
import domain.PagoTarjeta;
import domain.PagoPayPal;
import domain.PagoCripto;
public class PagoController {
    private PagoForm formularioPagos;
    private CriptoForm criptoForm;
    public PagoController(){
        this.createPaymentForm();
    }
    private void createPaymentForm(){
        this.formularioPagos = new PagoForm();
        this.formularioPagos.showWindow();
        this.formularioPagos.addCardPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.addCriptoPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.addPaypalPanelMouseEventListener(new ButtonClickListener());
        this.formularioPagos.showWindow(); 
    }
    private void createCriptoForm(){
        this.criptoForm = new CriptoForm();
        this.criptoForm.addPaymentButtonClickListener(new ButtonClickListener());
        this.criptoForm.showWindow();
        
    }
    private void createPaypalForm(){
        
    }
    private void handlePayment(Pago paymentStrategy){
        paymentStrategy.pagar();
    }
    /*
        private Pago buildPayment(){
        
    }
    */

    private class ButtonClickListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            JPanel src = (JPanel) e.getSource();
            if(src == formularioPagos.getCardPanel()){
                
            }
            if(src == formularioPagos.getPaypalPanel()){
                handlePayment(new PagoPayPal());
            }
            if(src == formularioPagos.getCriptoPanel()){
                createCriptoForm();
            }
            if(criptoForm != null){
                if(src == criptoForm.getPaymentButton()){
                    handlePayment(buildPayment());
                }
            }
        }
        
    }
}

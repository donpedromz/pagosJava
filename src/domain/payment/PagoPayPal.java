/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.payment;

import domain.AutenticacionExtra;
import domain.Pago;
import exceptions.UnauthorizedException;
import exceptions.PaymentException;
/**
 *
 * @author juanp
 */
public class PagoPayPal extends Pago implements AutenticacionExtra{
    private String authToken;
    private String authTokemAttempt;
    @Override
    public void pagar() throws PaymentException{
        try{
            autenticarTransaccion(this.authTokemAttempt);
            
        }catch(UnauthorizedException e){
            throw e;
        }
    }

    @Override
    public void autenticarTransaccion(String authToken) throws UnauthorizedException{
        
        if(!this.authToken.equals(authToken)){
            throw new UnauthorizedException("TOKEN INGRESADO INVALIDO");
        }
    }
}

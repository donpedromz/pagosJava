/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import exceptions.UnauthorizedException;

/**
 *
 * @author juanp
 */
public class PagoPayPal extends Pago implements AutenticacionExtra{
    private String authToken;
    @Override
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void autenticarTransaccion(String authToken) throws UnauthorizedException{
        if(!this.authToken.equals(authToken)){
            
        }
    }
}

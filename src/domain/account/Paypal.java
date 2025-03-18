/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.account;

/**
 *
 * @author juanp
 */
public class Paypal extends Cuenta{
    private String codigoVerificacion;
    private String token;

    public Paypal(String codigoVerificacion, String token, String numeroCuenta) {
        super(numeroCuenta);
        this.codigoVerificacion = codigoVerificacion;
        this.token = token;
    }
    
}

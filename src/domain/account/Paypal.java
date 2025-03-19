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

    public Paypal(String codigoVerificacion,String numeroCuenta) {
        super(numeroCuenta);
        this.codigoVerificacion = codigoVerificacion;
    }
    public void generateToken(){
        this.token = new String("12345");
    }
}

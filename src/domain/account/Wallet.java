/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.account;

/**
 *
 * @author juanp
 */
public class Wallet extends Cuenta{
    private String passkey;
    private String token;
    public Wallet(String passkey, String token, String numeroCuenta) {
        super(numeroCuenta);
        this.passkey = passkey;
        this.token = token;
    }
    
}

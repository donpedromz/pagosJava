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
    public Wallet(String passkey,String numeroCuenta) {
        super(numeroCuenta);
        this.passkey = passkey;
    }

    public String getPasskey() {
        return passkey;
    }

    public void setPasskey(String passkey) {
        this.passkey = passkey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    public void generateToken(){
        this.token = new String("12345");
        System.out.println(this.token);
    }
}

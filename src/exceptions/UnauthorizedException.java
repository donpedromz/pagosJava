/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author juanp
 */
public class UnauthorizedException extends PaymentException {

    public UnauthorizedException() {
        super("ACCESO DENEGADO");
    }
    public UnauthorizedException(String msg){
        super(msg);
    }
}

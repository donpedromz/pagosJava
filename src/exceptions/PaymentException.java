/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author juanp
 */
public class PaymentException extends Exception{
    public PaymentException(){
        super("ERROR AL PROCESAR SU PAGO");
    }
    public PaymentException(String msg){
        super(msg);
    }
}

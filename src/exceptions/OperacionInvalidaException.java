/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author juanp
 */
public class OperacionInvalidaException extends Exception{
    /**
     * 
     */
    public OperacionInvalidaException(){
        super("OPERACIÓN INVALIDA");
    }
    /**
     * 
     * @param msg 
     */
    public OperacionInvalidaException(String msg){
        super(msg);
    }
}

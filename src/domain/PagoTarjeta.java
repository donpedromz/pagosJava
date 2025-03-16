/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author juanp
 */
public class PagoTarjeta extends Pago{
    public String cvv;
    public String fechaVencimiento;
    public String numTarjeta;
    public PagoTarjeta(){
        super();
    }
    @Override
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.account;

/**
 *
 * @author juanp
 */
public class Tarjeta extends Cuenta{
    private String cvv;
    private String fechaVencimiento;

    public Tarjeta(String cvv, String fechaVencimiento, String numeroCuenta) {
        super(numeroCuenta);
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }
    
}

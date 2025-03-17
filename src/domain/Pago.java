/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author juanp
 */
import exceptions.PaymentException;
public abstract class Pago {
    protected String idPago;
    protected double montoTransaccion;
    protected String cuentaDestino;
    public Pago(){}
    public Pago(String idPago, double montoTransaccion, String cuentaDestino){
        this.idPago = idPago;
        this.montoTransaccion = montoTransaccion;
        this.cuentaDestino = cuentaDestino;
    }
    public Pago(Pago payment){
        this.idPago = payment.idPago;
        this.montoTransaccion = payment.montoTransaccion;
        this.cuentaDestino = payment.cuentaDestino;
    }
    public abstract void pagar() throws PaymentException;
    public String getIdPago() {
        return idPago;
    }
    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
    public double getMontoTransaccion() {
        return montoTransaccion;
    }
    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }
    public String getCuentaDestino() {
        return cuentaDestino;
    }
    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    
}

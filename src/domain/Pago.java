/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author juanp
 */
public abstract class Pago {
    private String idPago;
    private double montoTransaccion;
    private String cuentaDestino;
    public Pago(){}
    public Pago(String idPago, double montoTransaccion, String cuentaDestino){
        this.idPago = idPago;
        this.montoTransaccion = montoTransaccion;
        this.cuentaDestino = cuentaDestino;
    }
    public abstract void pagar();
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

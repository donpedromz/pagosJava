/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domain.account.Cuenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanp
 */
import exceptions.OperacionInvalidaException;
public class GestorCuentas {
    private List<Cuenta> cuentas;
    public GestorCuentas(){
        this.cuentas = new ArrayList<Cuenta>();
    }
    public GestorCuentas(List<Cuenta> cuentas){
        this.cuentas = cuentas;
    }
    public Cuenta buscarCuenta(String numeroCuenta) throws OperacionInvalidaException{
        for(Cuenta c : this.cuentas){
            if(c.getNumeroCuenta().equals(numeroCuenta)){
                return c;
            }
        }
        throw new OperacionInvalidaException("CUENTA" + numeroCuenta +" NO ENCONTRADA");
    }
}

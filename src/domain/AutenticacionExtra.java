/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain;

/**
 *
 * @author juanp
 */
import exceptions.UnauthorizedException;
public interface AutenticacionExtra {

    /**
     *
     * @throws exceptions.UnauthorizedException */
    public void autenticarTransaccion()throws UnauthorizedException;
}

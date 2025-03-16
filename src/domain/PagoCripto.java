/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author juanp
 */
import exceptions.UnauthorizedException;
public class PagoCripto extends Pago implements AutenticacionExtra{
    public String walletInfo;
    public String walletPasskey;
    @Override
    public void pagar(){
        try{
            autenticarTransaccion(walletPasskey);
            System.out.println("PAGO REALIZADO!");
        }catch(UnauthorizedException e){
            System.out.println("PAGO NO AUTORIZADO");
            return;
        }
    }
    @Override
    public void autenticarTransaccion(String passKey) throws UnauthorizedException{
        if(!this.walletPasskey.equals(passKey)){
            throw new UnauthorizedException();
        }
    }
    
}

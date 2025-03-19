/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author juanp
 */
import domain.account.Cuenta;
import domain.account.Wallet;
import java.util.ArrayList;
import services.GestorCuentas;
import services.PagoController;
public class paymentTest {
    public static ArrayList<Cuenta> generateWallet(){
        ArrayList<Cuenta> wallets = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            wallets.add(new Wallet("key" + i, "ACC00" + i)); // Claves y números de cuenta simulados
        }
        
        return wallets;
    }
    public static void main(String[] args) {
        GestorCuentas gestor = new GestorCuentas(generateWallet());
        PagoController controlador = new PagoController(gestor);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.payment;

/**
 *
 * @author juanp
 */
import domain.AutenticacionExtra;
import domain.Pago;
import domain.account.Cuenta;
import domain.account.Wallet;
import exceptions.UnauthorizedException;
import exceptions.PaymentException;

public class PagoCripto extends Pago implements AutenticacionExtra {
    private String walletPasskeyAttempt;
    private String walletTransactionTokenAttempt;
    private Wallet wallet;
    public PagoCripto(String id, double montoTransaccion, String cuentaDestino) {
        super(id, montoTransaccion, cuentaDestino);
    }
    public PagoCripto(Builder builder) {
        super(builder.idPago, builder.montoTransaccion, builder.cuentaDestino);
        this.walletPasskeyAttempt = builder.walletPasskeyAttempt;
        this.walletPasskeyAttempt = builder.walletPasskeyAttempt;
        this.wallet = builder.wallet;
        this.wallet.generateToken();
    }

    @Override
    public void pagar() throws PaymentException {
        try {
            autenticarTransaccion();
            System.out.println("PAGO REALIZADO!");
        } catch (UnauthorizedException e) {
            System.out.println("PAGO NO AUTORIZADO");
            return;
        }
    }

    @Override
    public void autenticarTransaccion() throws UnauthorizedException {
        this.wallet.generateToken();
        if (!this.walletPasskeyAttempt.equals(wallet.getPasskey())
                || !this.walletTransactionTokenAttempt.equals(wallet.getToken())) {
            throw new UnauthorizedException("ACCESO NO AUTORIZADO");
        }
    }

    public static class Builder {
        private Wallet wallet;
        private String idPago;
        private double montoTransaccion;
        private String cuentaDestino;
        private String walletPasskeyAttempt;
        public Builder idPago(String idPago) {
            this.idPago = this.idPago;
            return this;
        }
        public Builder montoTransaccion(double montoTransaccion) {
            this.montoTransaccion = montoTransaccion;
            return this;
        }
        public Builder cuentaDestino(String cuentaDestino) {
            this.cuentaDestino = cuentaDestino;
            return this;
        }
        public Builder wallet(Cuenta wallet){
            this.wallet = (Wallet) wallet;
            return this;
        }
        public Builder walletPasskeyAttempt(String walletPasskeyAttempt) {
            this.walletPasskeyAttempt = this.walletPasskeyAttempt;
            return this;
        }
        public PagoCripto build() {
            return new PagoCripto(this);
        }
    }

}

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
import exceptions.UnauthorizedException;
import exceptions.PaymentException;

public class PagoCripto extends Pago implements AutenticacionExtra {
    private String walletNumberAttempt;
    private String walletPasskeyAttempt;
    private String walletTransactionTokenAttempt;

    public PagoCripto(String id, double montoTransaccion, String cuentaDestino) {
        super(id, montoTransaccion, cuentaDestino);
    }

    public PagoCripto(String walletNumberAttempt, String walletPasskeyAttempt, String walletTransactionTokenAttempt, String idPago, double montoTransaccion, String cuentaDestino) {
        super(idPago, montoTransaccion, cuentaDestino);
        this.walletNumberAttempt = walletNumberAttempt;
        this.walletPasskeyAttempt = walletPasskeyAttempt;
        this.walletTransactionTokenAttempt = walletTransactionTokenAttempt;
    }
    

    public PagoCripto(Builder builder) {
        super(builder.idPago, builder.montoTransaccion, builder.cuentaDestino);
        this.walletPasskeyAttempt = builder.walletPasskeyAttempt;
    }

    @Override
    public void pagar() throws PaymentException {
        try {
            autenticarTransaccion(walletPasskey);
            System.out.println("PAGO REALIZADO!");
        } catch (UnauthorizedException e) {
            System.out.println("PAGO NO AUTORIZADO");
            return;
        }
    }

    @Override
    public void autenticarTransaccion(String passKey) throws UnauthorizedException {
        if (!this.walletPasskey.equals(passKey)) {
            throw new UnauthorizedException("PASSKEY DE SU WALLET INCORRECTA");
        }
        if (!this.walletTransactionToken.equals(walletTransactionAttempt)) {
            throw new UnauthorizedException("TOKEN INVALIDO");
        }

    }

    public static class Builder {

        private String idPago;
        private double montoTransaccion;
        private String cuentaDestino;
        private String walletPasskey;
        private String walletPasskeyAttempt;
        private String walletTransactionToken;
        private String walletTransactionAttempt;

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

        public Builder walletPasskey(String walletPasskey) {
            this.walletPasskey = walletPasskey;
            return this;
        }

        public Builder walletPasskeyAttempt(String walletPasskeyAttempt) {
            this.walletPasskeyAttempt = this.walletPasskeyAttempt;
            return this;
        }

        public Builder walletTransactionToken(String walletTransactionToken) {
            this.walletTransactionToken = this.walletTransactionToken;
            return this;
        }

        public Builder walletTransactionTokenAttempt(String walletTransactionTokenAttempt) {
            this.walletTransactionAttempt = walletTransactionTokenAttempt;
            return this;
        }

        public PagoCripto build() {
            return new PagoCripto(this);
        }
    }

}

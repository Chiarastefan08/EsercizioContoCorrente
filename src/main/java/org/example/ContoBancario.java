package org.example;

public class ContoBancario {
    private double saldo;

    public ContoBancario (double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void preleva (double numero) throws SaldoInsufficienteException {
        if ( numero <= 0){
            throw new ImportoNonValidoException();
        }

        if( numero > this.saldo) {
            throw new SaldoInsufficienteException(this.saldo, numero);
        }

        this.saldo -= numero;
    }
}

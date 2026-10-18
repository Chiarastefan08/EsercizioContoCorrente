package org.example;

public class SaldoInsufficienteException extends RuntimeException {
        private double SoldiAttuali;
        private double SoldiChiesti;

        public double getSoldiAttuali() {
            return SoldiAttuali;
        }

        public double getSoldiChiesti() {
            return SoldiChiesti;
        }

        public SaldoInsufficienteException (double soldi, double numero){
            SoldiAttuali = soldi;
            SoldiChiesti = numero;
        }
    }


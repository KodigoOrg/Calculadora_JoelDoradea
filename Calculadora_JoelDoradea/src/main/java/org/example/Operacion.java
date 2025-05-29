package org.example;

public class Operacion {
    private String tipoOperacion;
    private Numero numero1;
    private Numero numero2;

    public Operacion(String tipoOperacion, Numero numero1, Numero numero2) {
        this.tipoOperacion = tipoOperacion;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public Numero getNumero1() {
        return numero1;
    }

    public Numero getNumero2() {
        return numero2;
    }

    public String toString() {
        return tipoOperacion + ": " + numero1 + " y " + numero2;
    }
}

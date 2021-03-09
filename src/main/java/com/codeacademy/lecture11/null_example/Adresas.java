package com.codeacademy.lecture11.null_example;

public class Adresas {

    private Miestas miestas;

    public Adresas() {
    }

    public Adresas(Miestas miestas) {
        this.miestas = miestas;
    }

    public Miestas getMiestas() {
        return miestas;
    }

    public void setMiestas(Miestas miestas) {
        this.miestas = miestas;
    }
}

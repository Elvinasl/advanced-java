package com.codeacademy.lecture11.nullExample;

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

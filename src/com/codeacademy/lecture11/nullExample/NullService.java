package com.codeacademy.lecture11.nullExample;

public class NullService {
    public static String gautiMiestoPavadinima(Adresas adresas) {
        if (adresas != null) {
            Miestas miestas = adresas.getMiestas();
            if (miestas != null) {
                return miestas.getPavadinimas();
            }
        }
        return null;
    }
}

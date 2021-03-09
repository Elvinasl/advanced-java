package com.codeacademy.lecture11.exception_example;

import com.codeacademy.lecture11.exception_example.exceptions.LaikinaKlaida;
import com.codeacademy.lecture11.exception_example.exceptions.SvarbiKlaida;
import com.codeacademy.lecture11.exception_example.exceptions.VaziuoklesIsskleidimoKlaida;

import java.util.Random;

public class Lektuvas {

    private static final int PROBABILITY = 5;

    public void isskleistiVaziuokle()  {
        try {
            vaziuokle();
            System.out.println("OK: vaziuokle sekmingai isskleista");
        } catch (LaikinaKlaida exception) {
            System.out.println(gautiKlaidosTeksta(exception.getPriezastis(), Svarbumas.LAIKINA));
        } catch (SvarbiKlaida exception) {
            System.out.println(gautiKlaidosTeksta(exception.getPriezastis(), Svarbumas.SVARBU));
        }  catch (VaziuoklesIsskleidimoKlaida exception) {
            System.out.println(gautiKlaidosTeksta(exception.getPriezastis(), Svarbumas.NEZINOMA));
        }
    }

    private String gautiKlaidosTeksta(String priezastis, Svarbumas svarbumas) {
        return String.format("ERROR: nepavyko isskleisti vaziuokles. Priezastis: %s. Svarbumas: ", priezastis).concat(svarbumas.name());
    }

    private void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int x = rand.nextInt(PROBABILITY);
        switch (x) {
            case 0: throw new SvarbiKlaida("Neatsidare durys");
            case 1: throw new SvarbiKlaida("Nenusileido ratas");
            case 2: throw new LaikinaKlaida("Per didelis aukstis");
        }
    }

}


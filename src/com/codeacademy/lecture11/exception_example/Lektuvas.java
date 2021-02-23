package com.codeacademy.lecture11.exceptionExample;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle()  {
        try {
            vaziuokle();
            System.out.println("OK: vaziuokle sekmingai isskleista");
        } catch (LaikinaKlaida e) {
            System.out.println("ERROR: nepavyko isskleisti vaziuokles. " + "Priezastis: " + e.getPriezastis() + ". Svarbumas: laikina");
        } catch (SvarbiKlaida e) {
            System.out.println("ERROR: nepavyko isskleisti vaziuokles. " + e.getPriezastis() + "Svarbumas: svarbu");
        }  catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println("ERROR: nepavyko isskleisti vaziuokles. " + "Priezastis: " + e.getPriezastis() + ". Svarbumas: neznoma");
        }
    }

    void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int x = rand.nextInt(10);
        switch (x) {
            case 0: throw new SvarbiKlaida("Neatsidare durys");
            case 1: throw new SvarbiKlaida("Nenusileido ratas");
            case 2: throw new LaikinaKlaida("Per didelis aukstis");
        }
    }

}


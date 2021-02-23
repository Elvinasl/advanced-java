package com.codeacademy;


import com.codeacademy.lecture11.exception_example.Lektuvas;
import com.codeacademy.lecture11.null_example.Adresas;
import com.codeacademy.lecture11.null_example.Miestas;

import static com.codeacademy.lecture11.null_example.NullService.gautiMiestoPavadinima;

public class Main {

    public static void main(String[] args) {
        // Null example
        Adresas namuAdresas = new Adresas(new Miestas("Vilnius"));
        System.out.println(gautiMiestoPavadinima(namuAdresas));

        Lektuvas lektuvas = new Lektuvas();
        lektuvas.isskleistiVaziuokle();
     }


}

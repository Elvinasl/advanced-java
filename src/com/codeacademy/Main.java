package com.codeacademy;


import com.codeacademy.lecture11.nullExample.Adresas;
import com.codeacademy.lecture11.nullExample.Miestas;

import static com.codeacademy.lecture11.nullExample.NullService.gautiMiestoPavadinima;

public class Main {

    public static void main(String[] args) {
        // Null example
        Adresas namuAdresas = new Adresas(new Miestas("Vilnius"));
        System.out.println(gautiMiestoPavadinima(namuAdresas));


     }


}

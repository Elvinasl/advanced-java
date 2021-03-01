package com.codeacademy;


import com.codeacademy.interface_example.*;

public class Main {

    public static void main(String[] args) {
        // Null example
//        Adresas namuAdresas = new Adresas(new Miestas("Vilnius"));
//        System.out.println(gautiMiestoPavadinima(namuAdresas));
//
//        Lektuvas lektuvas = new Lektuvas();
//        lektuvas.isskleistiVaziuokle();

        InterfaceGenerator namableGenerator = new InterfaceGenerator();

        Creature randomObjectWithName = namableGenerator.generateInterface();

        if (randomObjectWithName instanceof Human) {
            Person person = (Person) randomObjectWithName;
            System.out.println(person.saySomethingSmart());
        }

        //randomObjectWithName.makeSound() we don't know yet whether its an animal or not?..
        if (randomObjectWithName instanceof Animal) {
            Animal animal = (Animal) randomObjectWithName;
            System.out.println(animal.makeSound());
        }

        System.out.println(randomObjectWithName.getName());
        System.out.println(randomObjectWithName.getIdentityNumber());


     }


}

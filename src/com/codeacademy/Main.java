package com.codeacademy;

public class Main {

    public static void main(String[] args) {
        PlaceHolder placeHolder = new PlaceHolder("Kazkas");

        placeHolder.getLabel();

        String result = placeHolder.getLabel();

        if (result != null) {
            System.out.println("rezultatas yra ne null");
        }

        placeHolder.setLabelToNull();

        if (placeHolder.getLabel() == null) {
            System.out.println("rezultatas yra null");
        }

    }
}

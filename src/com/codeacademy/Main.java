package com.codeacademy;

public class Main {

    public static void main(String[] args) {
        PlaceHolder placeHolder = new PlaceHolder("Kazkas");

        Button button = new Button();
        button.setId(99L);
        button.setLabel("Click me!");

        System.out.println(placeHolder.getLabel());
        System.out.println(button.trigger());
    }
}

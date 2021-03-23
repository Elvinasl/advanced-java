package lt.codeacademy.stream_api.basic.service;

import lt.codeacademy.stream_api.basic.model.Dish;

import java.util.List;

public class DishFactory {
    public static List<Dish> createSampleDishes() {
        return List.of(
                new Dish(1L, "Cepelinai", 5),
                new Dish(2L, "Graikiskos salotos", 3),
                new Dish(3L, "Karbonadas", 2),
                new Dish(4L, "Saltibarsciai", 5),
                new Dish(5L, "Burgeris", 15),
                new Dish(7L, "Spageciai", 3),
                new Dish(8L, "Kebabas", 4),
                new Dish(9L, "Jautienos tartar", 4),
                new Dish(10L, "Pica", 9),
                new Dish(11L, "Apelsinai", 1),
                new Dish(12L, "Sonkauliukai", 9)
        );
    }
}

package lt.codeacademy.stream_api.basic.service;

import lt.codeacademy.stream_api.basic.model.Dish;
import lt.codeacademy.stream_api.basic.model.view.PublicDishView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DishService {

    public List<String> getBoringDishNames(List<Dish> dishes) {
        // we used to write it like this
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : dishes) {
            dishNames.add(dish.getName());
        }
        return dishNames;
    }

    public List<String> getEasyDishNames(List<Dish> dishes) {
        // but now we are cool..
//        List<String> easyDishNames = dishes.stream()
//                .map(Dish::getName)
//                .collect(Collectors.toList());
//        return easyDishNames;
        return dishes.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
    }

    public List<PublicDishView> getDishView(List<Dish> dishes) {
        return dishes.stream()
                .map(this::getDishViewFromDish)
                .collect(Collectors.toList());
    }

    public List<PublicDishView> getDishViewHardWay(List<Dish> dishes) {
        List<PublicDishView> dishViews = new ArrayList<>();
        for (Dish dish : dishes) {
            dishViews.add(getDishViewFromDish(dish));
        }
        return dishViews;
    }

    public Dish getMostExpensiveDishEasy(List<Dish> dishes) {
        return dishes.stream()
                .max((d1, d2) -> d1.getPrice().compareTo(d2.getPrice()))
                .get();
    }

    private PublicDishView getDishViewFromDish(Dish dish) {
        PublicDishView dishView = new PublicDishView();
        dishView.setId(dish.getId());
        dishView.setName(dish.getName());
        dishView.setPrice(dish.getPrice());
        return dishView;
    }
}

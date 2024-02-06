package it.chiarapuleio.exdayone.exercise.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
public class MenuList {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Toppings> toppingsList;

    public MenuList(List<Pizza> pizzaList, List<Drink> drinkList, List<Toppings> toppingsList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingsList = toppingsList;
    }

    @Override
    public String toString() {
        return "MenuList{" +
                "pizzaList=" + pizzaList +
                ", drinkList=" + drinkList +
                ", toppingsList=" + toppingsList +
                '}';
    }
}

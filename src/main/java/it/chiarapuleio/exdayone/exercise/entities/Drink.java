package it.chiarapuleio.exdayone.exercise.entities;

import it.chiarapuleio.exdayone.exercise.abstractClass.SuperMenu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends SuperMenu {
    public Drink(String name, int kcal, double price) {
        super(name, kcal, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", kcal=" + kcal +
                ", price=" + price +
                '}' + '\n';
    }
}

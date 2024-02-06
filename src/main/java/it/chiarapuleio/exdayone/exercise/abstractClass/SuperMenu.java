package it.chiarapuleio.exdayone.exercise.abstractClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class SuperMenu {
    protected String name;
    protected int kcal;
    protected double price;
}

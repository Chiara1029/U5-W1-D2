package it.chiarapuleio.exdayone.exercise;

import it.chiarapuleio.exdayone.exercise.abstractClass.SuperMenu;
import it.chiarapuleio.exdayone.exercise.entities.*;
import it.chiarapuleio.exdayone.exercise.enums.OrderStatus;
import it.chiarapuleio.exdayone.exercise.enums.TableStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

    // ----- TOPPINGS -----
    @Bean
    Toppings getCheese(){
        return new Toppings("Cheese", 92, 0.69);
    }
    @Bean
    Toppings getHam(){
        return new Toppings("Ham", 35, 0.99);
    }
    @Bean
    Toppings getOnions(){
        return new Toppings("Onions", 22, 0.69);
    }
    @Bean
    Toppings getPineapple(){
        return new Toppings("Pineapple", 24, 0.79);
    }
    @Bean
    Toppings getSalami(){
        return new Toppings("Salami", 86, 0.99);
    }

    // ----- DRINKS -----
    @Bean
    Drink getLemonade(){
        return new Drink("Lemonade 33cl", 128, 1.29);
    }
    @Bean
    Drink getWater(){
        return new Drink("Water 50cl", 0, 1.29);
    }
    @Bean
    Drink getWine(){
        return new Drink("Wine 75cl - Vol 13%", 607, 7.49);
    }


    // ----- PIZZE -----
    @Bean
    Pizza getMargherita(){
        return new Pizza("Margherita", 1104, 4.99);
    }
    @Bean
    Pizza getHawaiianPizza(){
        List<Toppings> toppings = new ArrayList<>();
        toppings.add(getHam());
        toppings.add(getPineapple());
        return new Pizza("Hawaiian", 1024, 6.49, toppings);
    }
    @Bean
    Pizza getSalamiPizza(){
        List<Toppings> toppings = new ArrayList<>();
        toppings.add(getSalami());
        return new Pizza("Salami", 1160, 5.99, toppings);
    }

    @Bean
    MenuList getMenu(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(getMargherita());
        pizzas.add(getHawaiianPizza());
        pizzas.add(getSalamiPizza());
        //
        List<Toppings> toppings = new ArrayList<>();
        toppings.add(getCheese());
        toppings.add(getHam());
        toppings.add(getOnions());
        toppings.add(getPineapple());
        toppings.add(getSalami());
        //
        List<Drink> drinks = new ArrayList<>();
        drinks.add(getLemonade());
        drinks.add(getWater());
        drinks.add(getWine());
        //
        return new MenuList(pizzas, drinks, toppings);
    }

    @Bean
    Table table13(){
        return new Table(13,6,TableStatus.FREE);
    }

    @Bean
    Order order13(){
        List<SuperMenu> orderItems = new ArrayList<>();
        orderItems.add(getMargherita());
        orderItems.add(getMargherita());
        orderItems.add(getWater());
        orderItems.add(getSalamiPizza());
        orderItems.add(getWater());
        table13().setTableStatus(TableStatus.OCCUPIED);
        return new Order(table13(), orderItems, 45, OrderStatus.IN_PROGRESS, 3, LocalDate.now());
    }
}

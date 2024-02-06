package it.chiarapuleio.exdayone.exercise;

import it.chiarapuleio.exdayone.exercise.abstractClass.SuperMenu;
import it.chiarapuleio.exdayone.exercise.entities.*;
import it.chiarapuleio.exdayone.exercise.enums.OrderStatus;
import it.chiarapuleio.exdayone.exercise.enums.TableStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        MenuList ml = (MenuList) ctx.getBean("getMenu");
        System.out.println("----- MENU -----");
        System.out.println(ml);

        Table tb = (Table) ctx.getBean("table13");
        System.out.println("----- TABLES -----");
        System.out.println(tb);

        System.out.println("----- ORDERS -----");
        Pizza margherita = (Pizza) ctx.getBean("getMargherita");
        Pizza salami = (Pizza) ctx.getBean("getSalamiPizza");
        Drink water = (Drink) ctx.getBean("getWater");
        List<SuperMenu> orderItems = new ArrayList<>();
        orderItems.add(margherita);
        orderItems.add(margherita);
        orderItems.add(salami);
        orderItems.add(water);
        orderItems.add(water);
        tb.setTableStatus(TableStatus.OCCUPIED);
        Order order = new Order(tb, orderItems, 45, OrderStatus.IN_PROGRESS, 3, LocalTime.now());
        System.out.println(order);
        double charge = (double) ctx.getBean("tableCharge");
        double price = order.getOrderPrice(orderItems, charge);
        System.out.println("Totale ordine: " + price);

        ctx.close();
    }
}

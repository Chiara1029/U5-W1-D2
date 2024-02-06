package it.chiarapuleio.exdayone.exercise;

import it.chiarapuleio.exdayone.exercise.entities.MenuList;
import it.chiarapuleio.exdayone.exercise.entities.Order;
import it.chiarapuleio.exdayone.exercise.entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
//    @Value("$rest.chargeCost")
//    private double chargeCost;
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

        Order order = (Order) ctx.getBean("order13");
        System.out.println("----- ORDERS -----");
        System.out.println(order);

        ctx.close();
    }
}

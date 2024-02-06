package it.chiarapuleio.exdayone.exercise.entities;

import it.chiarapuleio.exdayone.exercise.abstractClass.SuperMenu;
import it.chiarapuleio.exdayone.exercise.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Order {
    private Table table;
    private List<SuperMenu> orderList;
    private int numberOrd;
    private OrderStatus orderStatus;
    private int totalCostumers;
    private LocalTime orderTime;

    public Order(Table table, List<SuperMenu> orderList, int numberOrd, OrderStatus orderStatus, int totalCostumers, LocalTime orderTime) {
        this.table = table;
        this.orderList = orderList;
        this.numberOrd = numberOrd;
        this.orderStatus = orderStatus;
        this.totalCostumers = totalCostumers;
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "table=" + table.getTableNumber() +
                ", orderList=" + orderList +
                ", numberOrd=" + numberOrd +
                ", orderStatus=" + orderStatus +
                ", totalCostumers=" + totalCostumers +
                ", orderTime=" + orderTime +
                '}';
    }
}

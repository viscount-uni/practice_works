package ru.mirea.lab16;

import ru.mirea.lab16.menu.Drink;
import ru.mirea.lab16.menu.DrinkType;
import ru.mirea.lab16.order.InternetOrder;
import ru.mirea.lab16.order.Order;
import ru.mirea.lab16.order.TableOrder;

import java.util.Arrays;

public class RestaurantDriver {

    public static void main(String[] args) {
        Drink drink = new Drink(19, "vodka", "ds", 50, DrinkType.JUICE);
        System.out.println(drink.isAlcoholicDrink());

        Order order = new TableOrder();
        order.add(drink);
        order.add(new Drink(399, "no vodka", "ds", 50, DrinkType.JUICE));
        System.out.println(Arrays.toString(order.getItems()));
        order.add (new Drink(19, "vodka", "ds", 50, DrinkType.JUICE));

        System.out.println(Arrays.toString(order.itemsNames()));
        System.out.println(Arrays.toString(order.sortedItemsByCost()));

        order.removeAll("vodka");
        System.out.println(Arrays.toString(order.itemsNames()));
    }
}
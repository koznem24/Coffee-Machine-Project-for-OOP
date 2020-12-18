package com.koznem;

public class Coffee extends CoffeeMachine {

    private String name;

    public Coffee(int water, int milk, int coffeeBeans, int money, String name) {
        super(water, milk, coffeeBeans, 1, money);
        this.name = name;
    }
}

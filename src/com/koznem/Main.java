package com.koznem;

import java.util.Scanner;
// Nematullo Kozimov
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachine defaulCoffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        boolean exit = false;
        String inputValue = "";
        while(!exit){
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            inputValue = scanner.nextLine();

            if(inputValue.equals("buy")){
                CoffeeMachine.buy(defaulCoffeeMachine);
            }else if(inputValue.equals("fill")){
                CoffeeMachine.fill(defaulCoffeeMachine);
            }else if(inputValue.equals("take")){
                CoffeeMachine.take(defaulCoffeeMachine);
            }else if(inputValue.equals("remaining")){
                CoffeeMachine.showSupply(defaulCoffeeMachine);
            }else if(inputValue.equals("exit")){
                exit = true;
            }
        }
    }
}

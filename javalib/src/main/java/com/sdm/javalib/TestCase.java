package com.sdm.javalib;
import java.util.Scanner;


public class TestCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int no_of_pizzas = 0;
        int flavour_of_pizzas;
        int size_of_pizzas;
        int no_of_orders = 0;
        int cost_of_pizzas = 0;
        int pizza_type = 0;
        String pizzaname = null;
        String pizzatype[] = {"Small Pepperoni: $100" ,"Medium Pepperoni: $120" , "Large Pepperoni: $140", "Small Seafood: $220" , "Medium Seafood: $320", "Large Seafood: $420", "Small Vegetarian: $100", "Medium Vegetarian: $150", "Large Vegetarian: $200"};
        do{
            System.out.print("***** Welcome to NYP Pizzeria! *****\n");
            System.out.print("Enter the number of pizzas you want to order: \n");
            no_of_pizzas = scan.nextInt();
            String[] empty = new String[no_of_pizzas];
            for (int i = 0; i < no_of_pizzas; i++)
            {
                Pizza pizza = new Pizza();
                System.out.print("Enter flavour of pizza " + (i + 1) + " :(0 = pepperoni, 1 = seafood, 2 = vegetarian) \n");
                flavour_of_pizzas = scan.nextInt();
                System.out.print("Enter size of pizza " + (i + 1) + " :(0 = pepperoni, 1 = seafood, 2 = vegetarian) \n");
                size_of_pizzas = scan.nextInt();
                no_of_orders++;
                System.out.println(no_of_orders+ "orders taken \n");
                if (flavour_of_pizzas == 0 && size_of_pizzas == 0)
                {
                    cost_of_pizzas += pizza.small_p;
                    empty[i] = "Small Pepperoni: $100";
                    pizzaname = pizzatype[0];

                }
                else if (flavour_of_pizzas == 0 && size_of_pizzas == 1)
                {
                    cost_of_pizzas += pizza.medium_p;
                    empty[i] = "Medium Pepperoni: $120";
                    pizzaname = pizzatype[1];
                }
                else if (flavour_of_pizzas == 0 && size_of_pizzas == 2)
                {
                    cost_of_pizzas +=  pizza.large_p;
                    empty[i] = "Large Pepperoni: $140";
                    pizzaname = pizzatype[2];
                }
                else if (flavour_of_pizzas == 1 && size_of_pizzas == 0)
                {
                    cost_of_pizzas += pizza.small_s;
                    empty[i] = "Small Seafood: $220";
                    pizzaname = pizzatype[3];
                }
                else if (flavour_of_pizzas == 1 && size_of_pizzas == 1)
                {
                    cost_of_pizzas += pizza.medium_s;
                    empty[i] = "Medium Seafood: $320";
                    pizzaname = pizzatype[4];
                }
                else if (flavour_of_pizzas == 1 && size_of_pizzas == 2)
                {
                    cost_of_pizzas += pizza.large_s;
                    empty[i] = "Large Seafood: $420";
                    pizzaname = pizzatype[5];
                }
                else if (flavour_of_pizzas == 0 && size_of_pizzas == 1)
                {
                    cost_of_pizzas += pizza.small_v;
                    empty[i] = "Small Vegetarian: $100";
                    pizzaname = pizzatype[6];
                }
                else if (flavour_of_pizzas == 0 && size_of_pizzas == 1)
                {
                    cost_of_pizzas += pizza.medium_v;
                    empty[i] = "Medium Vegetarian: $150";
                    pizzaname = pizzatype[7];
                }
                else if (flavour_of_pizzas == 0 && size_of_pizzas == 1) {
                    cost_of_pizzas += pizza.large_v;
                    empty[i] = "Large Vegetarian: $200";
                    pizzaname = pizzatype[8];
                }

            }
            System.out.print("Thank you for ordering with NYP Pizzeria!\n");
            for (int j = 0; j < empty.length; j++)
            {
                System.out.print("Below is a summary of your order: " +empty[j]);
                System.out.println("");
            }
            System.out.println("Total price is \n" +cost_of_pizzas);

        }while (no_of_pizzas != 0);
    }
}

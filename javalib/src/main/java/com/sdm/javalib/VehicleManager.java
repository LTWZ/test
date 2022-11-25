package com.sdm.javalib;
import java.util.Scanner;

public class VehicleManager {
    public static void main(String[] args){
        int no_of_vehicles;
        int choice_of_vehicles;
        int vehicle_count = 0;
        int no_of_helmets = 0;
        int choice_of_model;
        int test;
        int model;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("***** Welcome to NYP Garage! *****\n");
            System.out.print("Enter the number of vehicles you want to check in: \n");
            no_of_vehicles = scan.nextInt();
            String[] empty = new String[no_of_vehicles];
            for (int i = 0; i < no_of_vehicles; i++)
            {
                System.out.print("Enter the vehicle type 1(0-car, 1-motorbike): \n");
                choice_of_vehicles = scan.nextInt();
                System.out.print("Enter the model (0 for Scooter & 1 for Racer) : \n");
                model = scan.nextInt();
                System.out.println(model);
                if (choice_of_vehicles == 0)
                {
                    vehicle_count++;
                    System.out.println(vehicle_count+ " vehicle(s) checked in. \n");
                    empty[i] = "Minivan have " +Minivan.wheels+ " wheels and " +Minivan.doors+ " doors .\n";
                }
                else if (choice_of_vehicles == 1)
                {
                    vehicle_count++;
                    System.out.print("New helmets? Enter qty: (0 for none): \n");
                    no_of_helmets = scan.nextInt();
                    Vehicle vehicle;
                    if (model == 0)
                    {
                        vehicle = new Scooter();
                        empty[i] = "Scooter needs " +no_of_helmets+" helmets and have " +Scooter.wheels+ " wheels and " +Scooter.doors+ " doors .\n";
                    }
                    else if (model == 1)
                    {
                        vehicle = new Racer();
                        empty[i] = "Racer needs " +no_of_helmets+" helmets and have " +Racer.wheels+ " wheels and " +Racer.doors+ " doors .\n" ;
                    }
                    System.out.println(vehicle_count+ " vehicle(s) checked in. \n");
                }

            }
            System.out.print("Thank you for using NYP garage! \n");
            for (int j = 0; j < empty.length; j++)
            {
                System.out.print(empty[j]);
                System.out.println("");
            }
            System.out.print("Total number of helmets required:" +no_of_helmets+ "\n");
        }while (no_of_vehicles != 0);

    }


}

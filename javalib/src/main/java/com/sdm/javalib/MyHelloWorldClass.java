package com.sdm.javalib;

public class MyHelloWorldClass {
    public static void main(String[] args) {
// Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        int i;
        int num;

        //Empty String
        String primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int counter = 0;
            for (num = i; num >= 1; num--)
            {
                if (i % num == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Append the prime rNumber to the string
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime Numbers from 1 - 100 are: ");
        System.out.println(primeNumbers);
    }

}
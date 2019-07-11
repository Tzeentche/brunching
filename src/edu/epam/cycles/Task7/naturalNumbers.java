package edu.epam.cycles.Task7;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры

import java.util.*;
import java.lang.*;
import java.io.*;

public class naturalNumbers {

    public static void main(String[] args) {

        int divider, counterOfDividers = 0;
        int[] diapasoneOfnumbers = new int[2];
        String[] meaningsOfSection = {"First value","Last value"};

        Scanner input = new Scanner(System.in);

        try{

            for (int counter1 = 0; counter1 < meaningsOfSection.length; counter1++) {

                System.out.println("Please, enter natural natural number of " + meaningsOfSection[counter1] + "for section: ");
                diapasoneOfnumbers[counter1] = input.nextInt();
            }

        } catch (InputMismatchException e) {

            System.out.println(" ");
        }

        System.out.println("You entered diapason of numbers between M = " +
                diapasoneOfnumbers[0] + " and N = " + diapasoneOfnumbers[1] + ".");

        for (int diapasoneNumber = diapasoneOfnumbers[0]; diapasoneNumber <= diapasoneOfnumbers[1]; diapasoneNumber ++) {

            System.out.println("Divider for " + diapasoneNumber + " is: ");

            for (int counter2 = 2; counter2 <= diapasoneOfnumbers[1]; counter2++) {

                divider = diapasoneNumber % counter2;

                if (divider == 0 && diapasoneNumber != counter2) {

                    System.out.print(counter2 + " ");
                }

            }
            System.out.println(" ");
        }
    }
}

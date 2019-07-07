package edu.epam.line_programs.task4;

//      Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//      Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartsExchage {

        public static void main(String[] args) {

            double value;
            int firstPart, secondPart;

            Scanner input = new Scanner(System.in);

            try {

                    System.out.println("Please, enter value \"R\" with format of \"nnn.ddd\" : ");
                    value = input.nextDouble();

                System.out.println("Old value of number \"R\" is " + value);

                firstPart = (int)Math.round(value);
                secondPart = (int)((value - firstPart) * 1000);
                value = ((double)firstPart / 1000) + secondPart;

                System.out.println("New value of number \"R\" is " + value);

            } catch (InputMismatchException e) {

                System.out.println("Genius, enter NUMERAL value! Try again.");
            }
        }

}

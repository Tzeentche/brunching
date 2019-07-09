package edu.epam.brunching.task1;

//  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
//  и если да, то будет ли он прямоугольным

import java.util.*;

public class triangelsCorners {

    public static void main(String[] args) {

//        double firstCorner, secondCorner;
        double[] cornersValue = new double[2];
        String[] value = {"First Corner", "Second Corner"};

        Scanner input = new Scanner(System.in);

        try {

            for (int counter = 0; counter < cornersValue.length; counter ++) {

                System.out.println("Please, enter the degrees for " + value[counter] + ": ");
                cornersValue[counter] = input.nextDouble();
            }

        } catch (InputMismatchException e) {

            System.out.println("Please, for next time enter NUMERAL value! You can try again.");
        }

        if ((cornersValue[0] == 90 | cornersValue[1] == 90) | ((cornersValue[0] + cornersValue[1]) == 90)) {
            System.out.println("Your triangle exist ang is rectangular");

        } else if ((cornersValue[0] + cornersValue[1]) < 89) {

            System.out.println("Your triangle exist and isn't rectangular");

        } else {

            System.out.println("Your triangle cannot exist");
        }
    }
}

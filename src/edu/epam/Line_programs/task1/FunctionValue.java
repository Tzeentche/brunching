package edu.epam.Line_programs.task1;

import java.util.*;

public class FunctionValue {

    public static void main(String[] args) {

        double z;
        double[] param = new double[3];
        char[] val = {'A', 'B', 'C'};

            Scanner input = new Scanner(System.in);

            try {

                for (int i = 0; i < param.length; i ++) {

                    System.out.println("For equation \"z = ((a - 3) * b / 2) + c\", please, enter numeral value " + val[i] + ": ");
                    param[i] = input.nextDouble();
                }

                z = ((param[0] - 3) * param[1] / 2) + (param[2]);
                System.out.println("Function value is " + z);

            } catch (InputMismatchException e) {

                System.out.println("Genius, enter NUMERAL value! Try again.");
            }
    }    
}


package edu.epam.line_programs.task5;

//      Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//      Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//      ННч ММмин SSc.

import java.util.InputMismatchException;
import java.util.Scanner;

public class OutputTimeline {

        public static void main(String[] args) {

            int value, hours, minutes, seconds;

            Scanner input = new Scanner(System.in);

            try {

                System.out.println("Please, enter Time in seconds : ");
                value = input.nextInt();

                System.out.println("Time in seconds is " + value);
// 27424   76 hours 1 minutes 4 seconds
                hours = value / 360;
                minutes = (value - hours * 360) / 60;
                seconds = (value - hours * 360) % 60;

                System.out.println("Your time is " + hours + "ч " + minutes + "мин " + seconds + "с");

            } catch (InputMismatchException e) {

                System.out.println("Genius, enter NUMERAL value! Try again.");
            }
        }

    }

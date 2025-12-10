package Conditionals;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        // for loops

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        String[] names = { "Sweta", "Gudly", "Amiya" };

        for (String name : names) {
//            System.out.println("Name: " + name);
        }

        // while loops / Entry control loop

        int i = 0;
        while (i <= 10) {
//            System.out.print(i + " ");
          i++;
        }
        //Scanner s = new Scanner(System.in);


        // do while loop / exit control loop
//        int n;
//        do
//        {
//            System.out.print("Enter a number between 1 and 10: ");
//
//            n = s.nextInt();
//
//        } while (n < 1 || n > 10 );
//
//        System.out.println(n + " is between 1 and 10");



        // Jump Statements in Java
        // Continue Statement
        /*

        The continue statement pushes the next repetition of the loop to take place,
        skipping any code between itself and the conditional expression that controls the loop.
        */

        for (int j = 0; j < 5; j++) {
            if (j == 2){
                System.out.println();
                // using continue keyword
                // to skip the current iteration
                continue;
            }
            System.out.println(j);
        }


        // break
    }
}

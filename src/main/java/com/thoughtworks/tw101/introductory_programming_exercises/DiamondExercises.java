package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int totalRows = n;
        int leftPadding = n - 1;
        int totalAsterisks = 1;
        for (int i = 1; i <= totalRows; i++) {
            for (int j = leftPadding; j > 0; j--)
                System.out.print(" ");
            for (int j = 1; j <= totalAsterisks; j++) {
                System.out.print("*");
            }
            leftPadding--;
            System.out.println();
            totalAsterisks = totalAsterisks + 2;
        }
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int totalRows = n + (n - 1);
        int totalAsterisks = 1;
        int leftPadding = n - 1;
        for (int i = 1; i <= totalRows; i++) {
            for (int j = leftPadding; j > 0; j--)
                System.out.print(" ");
            for (int j = 1; j <= totalAsterisks; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i >= n) {
                leftPadding++;
                totalAsterisks = totalAsterisks - 2;
            } else {
                leftPadding--;
                totalAsterisks = totalAsterisks + 2;
            }
        }
    }

    //    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int totalRows = n + (n - 1);
        int totalAsterisks = 1;
        int leftPadding = n - 1;
        for (int i = 1; i <= totalRows; i++) {
            if (i != n) {
                for (int j = leftPadding; j > 0; j--)
                    System.out.print(" ");

                for (int j = 1; j <= totalAsterisks; j++) {
                    System.out.print("*");
                }
            } else
                System.out.print("Jackie");
            System.out.println();
            if (i >= n) {
                leftPadding++;
                totalAsterisks = totalAsterisks - 2;
            } else {
                leftPadding--;
                totalAsterisks = totalAsterisks + 2;
            }
        }
    }
}

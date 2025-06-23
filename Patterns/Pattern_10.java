package Patterns;
// Problem statement
// Ninja was very fond of patterns.For a given integer‘N’,he wants to make the N-Star Diamond.

// Example:Input:‘N’=3

// Output:

//   *
//  ***
// *****
//  ***
//   *
public class Pattern_10 {
   
        public static void nStarDiamond(int n) {
            // Write your code here
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    }


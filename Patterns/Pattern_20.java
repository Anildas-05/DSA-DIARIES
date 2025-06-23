package Patterns;
// Problem statement
// Sam is curious about symmetric patterns, so he decided to create one.

// For every value of ‘N’, return the symmetry as shown in the example.

// Example:
// Input: ‘N’ = 3

// Output: 
// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * * 

// Solution:-

public class Pattern_20 {
    
        public static void symmetry(int n) {
            // Write your code here
            int iniS = 0;
            for (int i = 0; i < n; i++) {
                // stars
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("* ");
                }
                // spaces
                for (int j = 0; j < iniS; j++) {
                    System.out.print(" ");
                }
                // stars
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("* ");
                }
                iniS += 2;
                System.out.println();
            }
            iniS = 2 * n - 2;
            for (int i = 1; i <= n; i++) {
                // stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // spaces
                for (int j = 0; j < iniS; j++) {
                    System.out.print(" ");
                }
                // stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                iniS -= 2;
                System.out.println();
            }
        }
    }
    

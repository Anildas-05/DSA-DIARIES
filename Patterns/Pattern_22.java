package Patterns;
// Problem statement
// Ninja has been given a task to print the required star pattern and he asked your help for the same.

// You must return an ‘N’*’N’ matrix corresponding to the given star pattern.

// Example:
// Input: ‘N’ = 4

// Output: 

// ****
// *  *
// *  *
// ****

// Solution:-

public class Pattern_22 {
    public static void symmetry(int n) {
        // Write your code here
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i < n)
                spaces += 2;
            else
                spaces -= 2;
        }
    }
}

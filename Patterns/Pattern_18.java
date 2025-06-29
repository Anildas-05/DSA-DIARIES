package Patterns;
// Problem statement
// Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of different sizes.

// An Alpha-hill is represented by a triangle, where alphabets are filled in palindromic order.

// For every value of ‘N’, help sam to return the corresponding Alpha-Hill.

// Example:
// Input: ‘N’ = 3

// Output: 
//     A
//   A B A
// A B C B A

// Solution:-

public class Pattern_18 {
  
    
        public static void alphaHill(int n) {
            // Write your code here
            for (int i = 0; i < n; i++) {
                // space
                for (int j = 0; j < (n - i - 1); j++) {
                    System.out.print(" ");
                }
                // charcter
                char ch = 'A';
                int breakpoint = (2 * i + 1) / 2;
                for (int j = 1; j <= (2 * i + 1); j++) {
                    System.out.print(ch + " ");
                    if (j <= breakpoint) {
                        ch++;
                    } else {
                        ch--;
                    }

                }

                // space
                for (int j = 0; j < (n - i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    
    
}

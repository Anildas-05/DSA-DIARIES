package Patterns;
// Problem statement
// Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

// You must print a matrix corresponding to the given Reverse Letter Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// A B C
// A B
// A

// Solution:-

public class Pattern_16 {
        public static void nLetterTriangle(int n) {
            // Write your code here
            for (int i = 0; i < n; i++) {
                for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    }
    

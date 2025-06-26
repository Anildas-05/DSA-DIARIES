// BRUTE FORCE APPROACH FOR COUNTING THE NUMBER OF DIGITS IN NUMBER

// import java.util.*;
// public class count_digits {
//     public static int countdigits(int n){
//         int cnt=0;
//         while(n>0){
//         cnt=cnt+1;
//         n=n/10;
//         }
//         return cnt;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(countdigits(n));
//     }
// }

// OPTIMISED APPROACH 

import java.util.*;
public class count_digits {
    public static int countdigit(int n){
        int cnt =(int)(Math.log10(n)+1);
        return cnt;
    }
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println(countdigit(n));
            }
}
import java.util.*;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int ld = x % 10;
            reversedHalf = reversedHalf * 10 + ld;
            x /= 10;
        }

        // Works for even and odd digits
        return x == reversedHalf || x == reversedHalf / 10;
    }
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                PalindromeNumber obj = new PalindromeNumber();
                System.out.println(obj.isPalindrome(x));
            }
}


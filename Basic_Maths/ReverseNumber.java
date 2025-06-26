import java.util.*;
public class ReverseNumber  {
    public static int reverse(int x) {
        int revNum = 0;
        while (x != 0) {
            int ld = x % 10;
            x = x / 10;
//  overflow for 32 bits 
            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && (ld > 7)))
                return 0;
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && (ld < -8)))
                return 0;

            revNum = (revNum * 10) + ld;
        }
        return revNum;
    }
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println(reverse(n));
            }
}
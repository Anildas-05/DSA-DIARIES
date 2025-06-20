import java.util.*;

public class pattern {

    public static void main(String[] args) {
        int n=5;
        // for(int i =0;i<n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=2*i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            // for(int j=1;j<2*n;j++){
            //     System.out.print(" ");
            // }
        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
            System.out.println();
        }
        
    }
}
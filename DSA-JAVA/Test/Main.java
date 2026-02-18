package Test;
import java.util.*;
public class Main {
    // * * *  * * *
    // * *      * *
    // *          *
    //
    // *          *
    // * *      * *
    // * * *  * * *
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;
        for (int i = 1; i <= mid; i++) {
            // star
            for (int j = mid; j >= i; j--) {
                System.out.print(" * ");
            }
            // space
            for (int k = 1; k <= (i - 1) * 2; k++) {
                System.out.print("   ");
            }
            System.out.print(" ");
            // star
            for (int j = mid; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" ");
        for (int i = 1; i <= mid; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // space
            for (int k = 1; k <= (mid - i) * 2; k++) {
                System.out.print("   ");
            }
            System.out.print(" ");
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
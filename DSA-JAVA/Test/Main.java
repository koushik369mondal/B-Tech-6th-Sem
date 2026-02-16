package Test;

import java.util.*;

public class Main {
    public static void swastika(int n) {
        int mid = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (
                    (i == 1 && j >= mid) || // top right
                    (j == 1 && i <= mid) || // top left vertical
                    (i == mid) || // middle horizontal
                    (j == mid) || // middle vertical
                    (i == n && j <= mid) || // bottom left
                    (j == n && i >= mid) // bottom right vertical
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        swastika(n);
    }
}
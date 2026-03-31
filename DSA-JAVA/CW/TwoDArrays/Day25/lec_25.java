// 31 May 2026
package CW.TwoDArrays.Day25;

import java.util.Scanner;

public class lec_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        wavePrint(arr);
        sc.close();
    }

    public static void wavePrint(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        for(int j=0; j<m; j++){
            if(j%2 == 0){
                for(int i=0; i<n; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for(int i=n-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

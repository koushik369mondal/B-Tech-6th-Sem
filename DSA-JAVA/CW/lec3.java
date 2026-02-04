package CW;

import java.util.Random;
import java.util.Scanner;

public class lec3 {
    public static void isLinear() {
        int x1 = 2;
        int y1 = 3;

        int x2 = 4;
        int y2 = 5;

        int x3 = 6;
        int y3 = 7;

        int m1 = (y2 - y1) / (x2 - x1);
        int m2 = (y3 - y2) / (x3 - x2);

        if (m1 == m2) {
            System.out.println("The points are collinear");
        } else {
            System.out.println("The points are not collinear");
        }
    }

    public static void lotteryGame(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 400;
        if(n >=300 && n <= 460){
            System.out.println("Price : Mackbook");
        } else if(n >= 200 && n <=280){
            System.out.println("Price kurkure");
        } else if(n >= 1100 && n <=1500 ){
            System.out.println("Price : Cycle");
        } else if( n > 50 && n <= 80){
            System.out.println("Price: Bike");
        } else{
            System.out.println("Better Luck Next Time");
        }
    }
    public static void main(String[] args) {
        // isLinear();
        lotteryGame();
    }
}

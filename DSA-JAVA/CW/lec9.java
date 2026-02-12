package CW;

public class lec9 {

    public static void evenOdd1(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int evenOdd2(int n){
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return n;
    }

    public static void max1(int a, int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static int max2(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        return 0;
    }

    public static void main(String[] args) {      
        int n = 10;

        // Using void function
        evenOdd1(n);

        //Using return type function
        evenOdd2(n);

        int a = 5, b = 10;
        max1(a, b);
        max2(a, b);
    }
}

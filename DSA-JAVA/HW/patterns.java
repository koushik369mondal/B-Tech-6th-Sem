package HW;

public class patterns {
    
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void pattern1(){
        int n = 5;

        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Using While Loop : ");
        int row = 1;
        while(row <= n){
            //star
            int i = 1;
            while(i<=n){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void pattern2(){
        int n = 5;

        System.out.println("Usinng For Loop : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Using While Loop : ");
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i <= row){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern3(){
        int n = 5;

        System.out.println("Using For Loop : ");
        for(int i=n; i>=1; i--){ // it controls the number of rows - 5,4,3,2,1
            for(int j=1; j<=i; j++){ // it controls the number of stars in each row - 5,4,3,2,1
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Using While Loop : ");
        int row = n;
        while(row >= 1){
            int i = 1;
            while(i <= row){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row--;
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        pattern3();
    }
}

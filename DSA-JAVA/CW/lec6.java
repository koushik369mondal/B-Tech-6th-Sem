public class lec6 {

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern1() {
        int n = 5;

        // System.out.println("Using For Loop : ");
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        System.out.println("Using While Loop : ");
        int row = 1;
        while (row <= 2 * n - 1) {
            int star = 1;
            if (row <= n) {
                while (star <= row) {
                    System.out.print(" * ");
                    star++;
                }
            } else {
                while (star <= 2 * n - row) {
                    System.out.print(" * ");
                    star++;
                }
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        pattern1();
    }
}

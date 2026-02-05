package CW;

public class lec4 {
    public static void pattern1() {
        // for (int i = 1; i <= 5; i++) {
        //     // Star
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int n = 5;
        int row = 1;
        while (row <= n) {
            // star
            int i = 1;
            while (i <= n) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        pattern1();
    }
}

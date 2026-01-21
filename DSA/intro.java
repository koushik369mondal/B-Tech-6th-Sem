// import java.util.*;

public class intro {

    static void Problem1() {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        int N = 4;
        int currentNumber = 1;
        for (int row = 1; row <= N; row++) {
            for (int count = 1; count <= row; count++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Problem1();
    }
}

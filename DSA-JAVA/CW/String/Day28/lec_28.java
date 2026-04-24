package CW.String.Day28;
import java.util.Scanner;

public class lec_28 {
    // reverse a string using recursion

    // frequancy of a String

    // test1
    public static void test1() {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        for(int ele : ch) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (char ele : ch) {
            System.out.print(ele + " ");
        }
    }

    // test3
    public static void test2() {
        String s = "Hello I am Kaushik Mandal";
        System.out.println(s);
    }

    // test3
    public static void test3() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(s1);
        sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s2);
        sc.close();
    }

    // count the number of vowels in a string
    public static void countVowels() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        sc.close();
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        countVowels();
    }
}

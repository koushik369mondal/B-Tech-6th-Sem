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
        String s = sc.nextLine(); // read a line of input from the user
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i); // get the character at index i
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        sc.close();
    }

    // Palindrome String - Two Pointer Approach
    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }

    // built in methods
    public static void builtInMethods(){
        String s1 = "Kaushik Mandal";
        String s2 = "Hello Guys";
        // System.out.println(s1.indexOf('k'));
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(0));
        // System.out.println(s1.substring(0, 3));
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.compareTo(s2)); //K-H = 3
        // System.out.println(s1.contains("Mandal"));
        // System.out.println(s1.startsWith("Kaushik"));
        System.out.println(s1.concat(s2));
    }

    public static int compareTo(String s1, String s2){
        System.out.println(s1 + ", " + s2);
        return -1;
    }

    public static void plus() {
        String s1 = "Kaushik";
        String s2 = "Mandal";
        String s3 = s1 + s2;
        s3 += 10;
        s3 += "\n"; // do nothinng
        s3 += "n in next line";
        System.out.println(s3);
        System.out.println(10 + 20 + " Kaushik ");
        System.out.println(10 + " Kaushik " + 20);
    }

    public static void intToString() {
        int n = 123;
        String s = Integer.toString(n);
        System.out.println(s);
    }

    public static void countDigits() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "" + n;
        System.out.println(s.length());
        sc.close();
    }

    public static void stringToCharArray() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (char i=0; i<ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        // countVowels();
        // isPalindrome();
        // builtInMethods();
        // compareTo("Kaushik", "Hello");
        // plus();
        // intToString();
        // countDigits();
        stringToCharArray();
    }
}

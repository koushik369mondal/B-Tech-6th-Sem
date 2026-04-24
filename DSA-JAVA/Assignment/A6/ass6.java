package Assignment.A6;

import java.util.Scanner;

public class ass6 {
    public static void main(String[] args) {
        canYouReadThis();
    }

    // Can You Read This?
    public static void canYouReadThis() {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch) && i != 0){
				System.out.println();
			}
			System.out.print(ch);
		}
        sc.close();
    }

    // String Compression
    public static void stringCompression1() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.print(s.charAt(i) + "" + count);
            i += (count - 1); // i += 2
        }
        sc.close();
    }

    // Strings-String Compression
    public static void stringCompression2() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > 1) {
                System.out.print(s.charAt(i) + "" + count);
            } else {
                System.out.print(s.charAt(i));
            }
            i += (count - 1);
        }
        sc.close();
    }
}

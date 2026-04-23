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
}

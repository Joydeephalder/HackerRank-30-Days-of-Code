// https://www.hackerrank.com/challenges/30-hello-world/problem

import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
       
		Scanner scan = new Scanner(System.in); 
		String inputString = scan.nextLine(); 
		scan.close(); 
		System.out.println("Hello, World.");
       		System.out.println(inputString);
	}
}

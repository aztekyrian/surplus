package src.com.app;

import java.util.Scanner;

public class HelloWorld{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello. I'm Ivan. What's your name? \n");
		String s = sc.next();
		System.out.println(s+", It's great to meet you");
		System.exit(0);
	}


}

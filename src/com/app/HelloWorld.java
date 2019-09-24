package src.com.app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class HelloWorld{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello. I'm Ivan. What's your name? \n");
		List<String> s = new ArrayList<String>();
		s.add(sc.next());
		System.out.println(s.get(0)+", It's great to meet you \n. What are you here for? ");
		s.add(sc.next());
		if(s.get(1).contains("buy")){
			System.out.println("That is a great choice");
		} else {
			System.out.println("Oh, I dont know what that is");
		}

	}


}

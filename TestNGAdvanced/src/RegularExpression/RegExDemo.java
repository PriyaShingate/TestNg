package RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {

		int count=1;
		
		System.out.println("Enter Text");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("User Entered Text >>"+ input);
		String ss[]=input.split("");
		for (int i = 1; i < ss.length; i++) {
			
			if(Pattern.matches("[A-Z]",ss[i])) {
				count++;
			}
		}
		if(ss.length==count) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}

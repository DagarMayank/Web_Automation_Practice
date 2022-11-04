package KamalClass;

import java.util.Scanner;

public class exceptionhandling2 {
public static void main(String[] args) throws Exception {
	
	exceptionhandling2 ex=new exceptionhandling2();
	ex.userinput();
	
}
public void userinput() throws Exception {
	System.out.println("entre your age");
	Scanner sc= new Scanner(System.in);
	int age=sc.nextInt();
	if(age>18) {
		System.out.println("you can vote");
	}
	else if(age==18) {
		System.out.println("you can also vote");
	}
	else {
		System.out.println("you are unfer age");
		throw new Exception("you are not eligible to vote");
	}
}
}

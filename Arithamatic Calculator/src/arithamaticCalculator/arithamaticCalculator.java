package arithamaticCalculator;

import java.util.Scanner;
public class arithamaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print(" 1 for Addition;\n 2 for Subtraction;\n 3 for Multiplication;\n 4 for Division; \n Choose Your Operation :");
		int choose=sc.nextInt();
		
		if(choose==1) {
			System.out.print("Enter a number :");
			int a=sc.nextInt();
			System.out.print("Enter another number :");
			int b=sc.nextInt();
			System.out.println("Answer is :"+(a+b));
		}
		else if(choose==2) {
			System.out.print("Enter a number :");
			int a=sc.nextInt();
			System.out.print("Enter another number :");
			int b=sc.nextInt();
			System.out.print("Answer is :"+(a-b));
		}
		else if(choose==3) {
			System.out.print("Enter a number :");
			int a=sc.nextInt();
			System.out.print("Enter another number :");
			int b=sc.nextInt();
			System.out.print("Answer is "+(a*b));
		}
		else if(choose==4) {
			System.out.print("Enter a number :");
			int a=sc.nextInt();
			System.out.print("Enter another number :");
			int b=sc.nextInt();
			System.out.print("Answer is "+(a/b));
		}else {
			System.out.println("choose 1 or 2 or 3 or 4");
		}
		
		
	}
	public static int add(int a, int b) {
		int n;
		n=a+b;
		return n;
		
	}
    public static int sub(int a, int b) {
    	int n;
    	n=a-b;
    	return n;
		
	}
    public static int mul(int a,int b) {
    	int n;
    	n=a*b;
    	return n;
		
	}
    public static int div(int a, int b) {
    	int n;
    	n=a/b;
    	return n;
		
	}


}
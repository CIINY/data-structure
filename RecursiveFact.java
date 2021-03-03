package hello;

import java.util.Scanner;

public class RecursiveFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int input = sc.nextInt();
		
		sc.close();
		
		System.out.println(fact(input));
	}
	
	public static int fact(int n) {
		if(n<=1)
			return n;
		else
			return fact(n-1)*n;
	}
}

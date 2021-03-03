package hello;

import java.util.Scanner;

public class basicList {

	public static void main(String[] args) {
		
		//1.배열생성
		int[] arr = new int[10];
		
		//2.입력받기
		Scanner sc = new Scanner(System.in);
		
		//3.입력된 이름을 배열에 순서에 맞게 저장
		for(int i = 0; i < 5; i++) {
			System.out.print("정수를 입력해주세요: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

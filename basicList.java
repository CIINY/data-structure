package hello;

import java.util.Scanner;

public class basicList {

	public static void main(String[] args) {
		
		//1.�迭����
		int[] arr = new int[10];
		
		//2.�Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		//3.�Էµ� �̸��� �迭�� ������ �°� ����
		for(int i = 0; i < 5; i++) {
			System.out.print("������ �Է����ּ���: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

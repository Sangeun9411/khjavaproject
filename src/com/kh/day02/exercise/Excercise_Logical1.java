package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical1 {
	public static void main(String[] args) {
		// �Է¹��� ������ 1 ~ 100 ������ �������� Ȯ��.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		boolean result;
		result = (num >= 1) && (num <= 100);
		
		System.out.println(result);
		
		
	}

}

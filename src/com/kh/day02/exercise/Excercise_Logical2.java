package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {
	public static void main(String[] args) {
		// �Է¹��� ���ڰ� �빮������ �ҹ������� Ȯ���Ͽ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		char word = sc.next().charAt(0);
		
		
		
		boolean result = ('A' <= word) && (word <='Z');
		
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
		
		
	}
}

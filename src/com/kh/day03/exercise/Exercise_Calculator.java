package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// �ΰ��� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���.
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �ѹ��� �Է����ּ��� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
	
		int sum = 0;
		if(operator == '+') {
			sum = num1 + num2;
		} else if(operator == '-') {
			sum = num1 - num2;
		} else if(operator == '*') {
			sum = num1 * num2;
		} else if(operator == '/') {
			sum = num1 / num2;
		} else {
			sum = num1 % num2;
		}
		
		System.out.println("��� : " + num1 + " " + operator + " " + num2 + " = " + sum);
	}

}

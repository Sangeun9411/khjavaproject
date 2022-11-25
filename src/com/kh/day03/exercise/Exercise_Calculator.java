package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// 두개의 정수를 입력받고 연산자를 입력받아서
		// 계산하는 계산기 프로그램을 작성하세요.
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 한번더 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
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
		
		System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + sum);
	}

}

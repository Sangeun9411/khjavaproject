package com.kh.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("비교연산자 예제");
		
		// 비교연산자는 두값을 비교하는 연산자, 관계연산자
		// true, false 반환.
	
		int num1 = 50;
		int num2 = 30;
		boolean result = num1 < num2;
		System.out.println("num1 < num2의 결과: " + result);
		
		result = (num1>num2);
		System.out.println("num1 > num2의 결과: " + result);
		
		result = (num1 == num2);
		System.out.println("num1 == num2의 결과: " + result);
		
		result = (num1 != num2);
		System.out.println("num1 != num2의 결과: " + result);
		
		// 짝홀 판별 프로그램
		int num = 2;
		result = (num % 2 == 0);  // 나누기의 결과는 
		System.out.println("짝수인가요? : " + result);
		
	}
}

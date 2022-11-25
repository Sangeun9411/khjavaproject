package com.kh.day02.operator;

import java.io.Console;

public class Exam_Logical {
	public static void main(String[] args) {
		
		
		System.out.println("논리연산자 예제");
		
		// 남자이면서 평균평점 4.3 이상인 사람 -> AND
		// 컴퓨터공학과 또는 경영하과인 사라므 -> OR
		
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; //변선

		//num1 과 num2 가 다르면서 num2가 num1보다 클 때.
		result1 = (num1 != num2) && (num1 <num2);
		System.out.println("result1의 결과값: " + result1);
		
		result2 = (num1 < num2) || (num1 == num2);
		// false
		result3 = (num1 > num2) && (num1 != num2);
		// true
		result4 = (num1 > num2) || (num1 == num2);
		// true
		System.out.println("result2의 결과값 :" + result2);
		System.out.println("result3의 결과값 :" + result3);
		System.out.println("result4의 결과값 :" + result4);
		System.out.println();
		System.out.println("논리연산자 예제2");
		
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		result2 = (aNum < bNum) && (--bNum < 55);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		
		
		System.out.println("result1의 결과값 : "+ result1);
		System.out.println("result2의 결과값 : "+ result2);
		System.out.println("result3의 결과값 : "+ result3);
		System.out.println("result4의 결과값 : "+ result4);
		
		
		
		
		
		
		
	}

}

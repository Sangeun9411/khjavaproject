package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		// 삼항연산자 
		// (조건식) ? 참 : 거짓
		// 조건식은 true or false 반환
		
		// 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int input = sc.nextInt();
		
		String str = (input % 2 == 0) ? "짝수" : "홀수";
		System.out.println(input + "은/는 " + str + "입니다.");
		
		
	}
}

package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical1 {
	public static void main(String[] args) {
		// 입력받은 정수가 1 ~ 100 사이의 숫자인지 확인.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		boolean result;
		result = (num >= 1) && (num <= 100);
		
		System.out.println(result);
		
		
	}

}

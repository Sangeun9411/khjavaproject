package com.kh.day02.variable;

public class TestDataType {
	public static void main(String[] args) {
		
		// 1. 자료형의 종류

		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648L; // 접미사 L 을 붙여야함.
	
		float fNum = 22.1123f;
		double dNum = 23.502;
		
		char fChar = 'A';
		String sChar = "Hello Java";

		boolean result = false;
		
		System.out.println("정수의 값 : " +iNum);
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("실수의 값 : " + dNum);
		System.out.println("문자의 값 : " + fChar);
		System.out.println("문자열의 값 : " + sChar);
		System.out.println("논리의 값 : " + result);
		
		fChar = 66;
		System.out.println("문자에 숫자 : " + fChar);
		fChar = 75;
		System.out.println("문자에 숫자2 : " + fChar);
		
		
		
	}
}

package com.kh.day02.operator;
public class Exam_Unary {
	public static void main(String[] args) {
		////////// 1번문제
		int a = 10, b = 20, c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);
		System.out.println("c의 값: " + c);
		
		///////////2번문제
		int x = 100, y=33, z=0;
		x--;
		z = x-- + --y;
		x = 99 + x++ +x;
		y = y-- + y + ++y;
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		System.out.println("z의 값: " + z);
		
		////////////
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

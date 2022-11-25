package com.kh.day03.typetrans;

public class TestTypeTrans2 {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		//자동형변환
		System.out.println(b+i);       // b는 int로 자동형변환
		System.out.println(10/4);
		System.out.println(10.0/4);    // 4는 4.0(실수)로 자동형변환
	
		//강제형변환
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);         // 3.8
		System.out.println((int)(2.9 +1.8));        // 4
		System.out.println((int)2.9 + (int)1.8);    // 3
	}

}

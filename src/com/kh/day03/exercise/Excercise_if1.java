package com.kh.day03.exercise;

import java.util.Scanner;

public class Excercise_if1 {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서 양의 정수인지, 0인지, 음의정수인지

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력:");
		int input = sc.nextInt();
		String result = "";

		if (input > 0) {
			result = "양의정수";
		} else if (input == 0) {
			result = "0";
		} else {
			result = "음의정수";
		}

		System.out.println(input + "은/는 " + result + "입니다.");

	}

}

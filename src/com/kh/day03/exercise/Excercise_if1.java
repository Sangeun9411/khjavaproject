package com.kh.day03.exercise;

import java.util.Scanner;

public class Excercise_if1 {

	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ������������

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է�:");
		int input = sc.nextInt();
		String result = "";

		if (input > 0) {
			result = "��������";
		} else if (input == 0) {
			result = "0";
		} else {
			result = "��������";
		}

		System.out.println(input + "��/�� " + result + "�Դϴ�.");

	}

}

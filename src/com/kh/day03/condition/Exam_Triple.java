package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		// ���׿����� 
		// (���ǽ�) ? �� : ����
		// ���ǽ��� true or false ��ȯ
		
		// ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int input = sc.nextInt();
		
		String str = (input % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(input + "��/�� " + str + "�Դϴ�.");
		
		
	}
}

package com.kh.day02.variable;

public class TestDataType {
	public static void main(String[] args) {
		
		// 1. �ڷ����� ����

		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648L; // ���̻� L �� �ٿ�����.
	
		float fNum = 22.1123f;
		double dNum = 23.502;
		
		char fChar = 'A';
		String sChar = "Hello Java";

		boolean result = false;
		
		System.out.println("������ �� : " +iNum);
		System.out.println("������ ��(9999��) : " + lNum);
		System.out.println("�Ǽ��� �� : " + fNum);
		System.out.println("�Ǽ��� �� : " + dNum);
		System.out.println("������ �� : " + fChar);
		System.out.println("���ڿ��� �� : " + sChar);
		System.out.println("���� �� : " + result);
		
		fChar = 66;
		System.out.println("���ڿ� ���� : " + fChar);
		fChar = 75;
		System.out.println("���ڿ� ����2 : " + fChar);
		
		
		
	}
}

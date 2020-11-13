package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("첫번째 숫자: ");
		x = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		y = sc.nextInt();
		
		int result01;
		int result02;
		
		if(x > y) {
			result01 = x / y;
			result02 = x % y;
			System.out.println("몫: " + result01);
			System.out.println("나머지: " + result02);
		}else if(x < 7) {
			result01 = y / x;
			result02 = y % x;
			System.out.println("몫: " + result01);
			System.out.println("나머지: " + result02);
		}else {
			System.out.println("몫: 1");
			System.out.println("나머지: 0");
		}
		sc.close();

	}

}

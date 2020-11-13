package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 숫자: ");
		
		int x;
		x = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int y;
		y = sc.nextInt();
		
		if(x % y == 0) {
			System.out.println(y + "는(은) " + x + "의 약수입니다.");
		}else if(y % x == 0) {
			System.out.println(x + "는(은) " + y + "의 약수입니다.");
		}else if(x % 7 != 0) {
			System.out.println(x + "는(은) " + y + "의 약수가 아닙니다.");
		}else {
			System.out.println(y + "는(은) " + x + "의 약수가 아닙니다.");
		}
		sc.close();

	}

}

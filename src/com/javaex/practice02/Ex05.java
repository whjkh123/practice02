package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		
		int cm;
		cm = sc.nextInt();
		
		System.out.print("몸무게: ");
		
		int kg;
		kg = sc.nextInt();
		
		double ever = 72.0;
		
		double result = (cm - 100) * 0.9;
		
		if(kg > ever) {
			System.out.println("과체중 입니다.");
			System.out.println("표준체중: " + ever);
		}else if(kg == ever) {
			System.out.println("표준 입니다.");
			System.out.println("표준체중: " + ever);
		}else {
			System.out.println("저체중 입니다.");
			System.out.println("표준체중: " + ever);
		}
		sc.close();
	}

}

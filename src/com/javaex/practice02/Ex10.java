package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번을 입력해주세요.");
		
		int x;
		System.out.print("사번: ");
		x = sc.nextInt();
				
		if(x % 3 == 0) {
			System.out.println("A팀입니다.");
		}else if(x % 3 == 1) {
			System.out.println("B팀입니다.");
		}else if(x < 0) {
			System.out.println("잘못입력하셨습니다.");
		}
		else {
			System.out.println("C팀입니다.");
		}
		sc.close();
	}

}

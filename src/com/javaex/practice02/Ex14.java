package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		
		int use;
		double tax;
				
		System.out.print("금익: ");
		use = sc.nextInt();
		
		if(use >= 0 && use <= 1000) {
			tax = use * 0.09;
			System.out.println("소득세는 " + tax + "입니다.");
		}else if(use > 1000 && use <= 4000) {
			tax = 1000 * 0.09 + 0.18 * (use - 1000);
			System.out.println("소득세는 " + tax + "입니다.");
		}else if(use > 4000 && use < 8000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (use - 4000);
			System.out.println("소득세는 " + tax + "입니다.");
		}else if(use < 0) {
			System.out.println("잘 못 입력했습니다.");
		}
		else {
			tax = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 + (use - 8000);
			System.out.println("소득세는: " + tax + "입니다.");
		}
		sc.close();

	}

}

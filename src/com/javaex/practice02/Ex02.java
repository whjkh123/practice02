package com.javaex.practice02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		x = sc.nextInt();//변수를 받아 줄 스캐너 정의
		
		//x가 0과 같으면
		if(x == 0) {// x = 0 > x == 0으로 수정
			System.out.println("x는 0이다.");
		}else {
			System.out.println("x는 " + x + "이다.");//x가 0이 아닐 경우 역시 정의
		}
		sc.close();

	}

}

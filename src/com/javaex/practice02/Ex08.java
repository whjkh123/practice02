package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		
		System.out.print("숫자1: ");
		int x;
		x = sc.nextInt();		
		
		System.out.print("숫자2: ");
		int y;
		y = sc.nextInt();
		
		System.out.print("숫자3: ");
		int z;
		z = sc.nextInt();
		
		if(x < y && x < z) {
			System.out.println("가장 작은 수는  " + x + "입니다.");
		}else if(y < z && y < x){
			System.out.println("가장 작은 수는 " + y + "입니다.");
		}else{
			System.out.println("가장 작은 수는 " + z + "입니다.");
		}
		sc.close();
	}

}

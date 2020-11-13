package com.javaex.practice02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 15;
		age = sc.nextInt();//나이를 입력 할 스캐너 명령어를 설정한다.
		
		//age가 0살 초과이고 18살 미만이면
		if(0 < age && 18 > age) {//if 조건문 정의가 잘 못됐다. 초과이고 미만이면 > &&연산자
			System.out.println("청소년 입니다.");
		}else {
			System.out.println("성인 입니다.");//18세 이상일 경우 또한 정의해 주는것이 좋다.
		}
		sc.close();

	}

}

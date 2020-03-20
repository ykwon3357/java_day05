package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex22 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 정수 3개 입력 받는다
		// 큰수, 작은수 출력
		// 논리연산자 사용금지
		int a = 0, b = 0, c = 0, max = 0, mid = 0, min = 0;

		System.out.println("첫번째 수 입력:"); a = sc.nextInt();
		System.out.println("두번째 수 입력:"); b = sc.nextInt();
		System.out.println("세번째 수 입력:"); c = sc.nextInt();
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (max > c) {
			if (min > c) {
				mid = min;
				min = c;
			} else{
				mid = c;
			}
		} else {
			mid = max;
			max = c;
		}
		
		//1번째 방법
		/*if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (max > c) {
			if (min > c) {
				mid = min;
				min = c;
			} else{
				mid = c;
			}
		} else {
			mid = max;
			max = c;
		}*/

		//2번째 방법
		/* 
		if (a > b) {
			if (a > c) {
				max = a;
				if (b > c) {
					mid = b;
					min = c;
				} else {
					mid = c;
					min = b;
				}
			} else {
				max = c;
				mid = a;
				min = b;
			}
		} else {
			if (b > c) {
				max = b;
				if (a > c) {
					mid = a;
					min = c;
				} else {
					mid = c;
					min = a;
				}
			} else {
				max = c;
				mid = b;
				min = a;
			}
		
		}*/
		System.out.printf("max:%d, mid:%d, min:%d", max, mid, min);
	}
}

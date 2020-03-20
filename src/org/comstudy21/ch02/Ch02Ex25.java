package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=0, count=0;
		double sum=0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하시오.");
		System.out.println("숫자 입력: ");
		n = sc.nextInt();
		while(n!=-1){
			sum+=n;
			count++;
			System.out.println("숫자 입력: ");
			n=sc.nextInt();
		}
		System.out.printf("정수의 개수는 %d개이고, 평균은 %.1f입니다.",count,sum/count);

	}

}

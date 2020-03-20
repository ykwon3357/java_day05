package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex23 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 시작단 종료단 합쳐서 3행 3열

		int startDan = 0;
		int endDan = 0;

		System.out.println("시작단 입력: ");
		startDan = sc.nextInt();
		System.out.println("끝단 입력: ");
		endDan = sc.nextInt();

		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int dan = startDan; dan <= endDan; dan += 3) {

			for (int i = 0; i < 3; i++) {
				if (dan + i < endDan + 1) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();

			for (int cnt = 1; cnt <= 9; cnt++) {
				for (int i = 0; i < 3; i++) {
					if (dan + i < endDan + 1) {
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				System.out.println();
			}
		}
	}

	public static void test04(String[] args) {
		// 시작단 종료단 합쳐서 3행 3열

		for (int dan = 2; dan <= 9; dan += 3) {
			for (int i = 0; i < 3; i++) {
				if (dan + i != 10) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();

			for (int cnt = 1; cnt <= 9; cnt++) {
				for (int i = 0; i < 3; i++) {
					if (dan + i != 10) {
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				System.out.println();
			}
		}

	}

	public static void test03(String[] args) {
		/*
		 
		 ***2***	***3*** ***4***
		 2*1=2
		 2*2=4
		 ...
		 
		 ***5***
		 
		 
		 ***8***
		 *
		 */

		int j = 2;
		for (int dan = 1; dan <= 3; dan++) {

			for (int cnt = 0; cnt <= 9; cnt++) {
				if (cnt == 0) {
					System.out.printf("***%d***\t", j);
					System.out.printf("***%d***\t", j + 1);
					System.out.printf("***%d***\t", j + 2);
				} else {
					int num = j;
					for (int i = 1; i <= 3; i++) {
						if (j == 8)
							i++;
						System.out.printf("%d*%d=%d\t", num, cnt, num * cnt);
						num++;
					}

				}
				System.out.println();
			}
			System.out.println();
			j += 3;

		}

	}

	public static void test02(String[] args) {
		int startDan = 0;
		int endDan = 0;

		System.out.println("시작단 입력: ");
		startDan = sc.nextInt();
		System.out.println("끝단 입력: ");
		endDan = sc.nextInt();

		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int dan = startDan; dan <= endDan; dan++) {
			System.out.printf("***%d***\n", dan);
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.printf("%d*%d=%d\n", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}

	public static void test01(String[] args) {
		// 구구단 출력
		// 2단

		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("***%d***\n", dan);
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.printf("%d*%d=%d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}

	}

}

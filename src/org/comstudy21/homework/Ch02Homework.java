package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Homework {
	/*주말과제 4
	 * 높다/낮다 게임
	 * 컴퓨터가 난수(1~100)만듦
	 * 사용자가 5번안에 맞춰야함
	 * ex) 
	 * --------------------
	 * GAME
	 * --------------------
	 * 시스템이 숫자를 생성하였습니다.(35)
	 * 정답입력(1~100사이): 100
	 *  >> 범위를 초과 하였습니다.
	 * 다시입력(1~100사이): 50
	 * >>50은 너무 큰 숫자입니다.
	 * >>기회가 4번 남았습니다.
	 * 정답입력(1~49사이):30
	 * >>30은 너무 작은 숫자입니다.
	 * >>기회가 3번 남았습니다.
	 * 정답입력(31~49사이)" 35
	 * >>정답입니다!
	 * --------------------
	 * 계속 하시겠습니까(y/n)? t
	 * >> y/n 만 입력하세요!
	 * 계속 하시겠습니까(y/n)? n
	 * ---------------------
	 * 수고하셨습니다!
	 * 계속 하시겠습니까(y/n)? y
	 * 
	 * 시스템이 숫자를 생성하였습니다.
	 * 정답입력(1~100사이):
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, answer = 0;
		String sel = "";

		System.out.println("--------------------");
		System.out.println("GAME");
		System.out.println("--------------------");
		do {
			int start = 1, end = 100;

			System.out.println("시스템이 숫자를 생성하였습니다.");
			answer = (int) (Math.random() * 100 + 1);

			for (int i = 1; i <= 5; i++) {

				System.out.printf("정답입력(%d~%d사이): ", start, end);
				num = sc.nextInt();

				while (num < start || num > end) {
					System.out.println("범위를 초과 하였습니다.");
					System.out.printf("다시입력(%d~%d사이): ", start, end);
					num = sc.nextInt();
				}

				if (num == answer) {
					System.out.println("정답입니다!");
					break;
				}

				if (num > answer) {
					end = num - 1;
				} else {
					start = num + 1;
				}

				System.out.printf("%d은 너무 %s 숫자입니다.\n", num, (num > answer) ? "큰" : "작은");
				System.out.printf("기회가 %d번 남았습니다.\n", 5 - i);

			}
			sc.nextLine();
			System.out.println("--------------------");
			System.out.println("계속 하시겠습니까(y/n)?");
			sel = sc.nextLine();
			while (!sel.equals("y") && !sel.equals("n")) {
				System.out.println("y/n 만 입력하세요!");
				System.out.println("계속 하시겠습니까(y/n)?");
				sel = sc.nextLine();
			}

		} while (sel.equals("y"));
		System.out.println("---------------------");
		System.out.println("수고하셨습니다!");
	}
}

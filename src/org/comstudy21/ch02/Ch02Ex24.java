package org.comstudy21.ch02;

public class Ch02Ex24 {

	public static void main(String[] args) {
		int cnt, i;
		for (cnt = 1; cnt <= 5; cnt++) {
			for (i = 1; i <= 10; i++) {
				if (i % 3 == 0)
					break;
				System.out.print(" " + i);
			}
			System.out.println();
		}
		
		System.out.println("\n break에 레이블 지정하기");
		exit_for:

		for (cnt = 1; cnt <= 5; cnt++) {
			for (i = 1; i <= 10; i++) {
				if (i % 3 == 0)
					break exit_for;
				System.out.print(" " + i);
			}
		}
	}
}

package org.comstudy21.ch02;

public class Ch02Ex20 {

	public static void main(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10=7
		final int MAX = 21;
		int total = 2;
		boolean flag = true;
		for (int prev = 0, cur = 1, next = 0; cur <= MAX; next = prev+ cur, prev = cur, cur = next){
			System.out.print(cur);
			if (flag) {
				total -= cur;
				System.out.print("+");
				flag = false;
			} else {
				total += cur;
				System.out.print(cur == MAX ? "=" : "-");
				flag = true;
			}
		}
		System.out.print(total);
	}

}

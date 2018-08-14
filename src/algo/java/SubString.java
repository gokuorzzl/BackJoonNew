
package algo.java;

import java.util.Scanner;

public class SubString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자열 10개씩 출력하는 문제
		// str.substring(10*i) = (시작지점)부터 ~ 끝까지 알아서 처리됨~!
		try {
			String str = sc.next();
			int a = str.length() / 10;
			for (int i = 0; i < a + 1; i++) {
				if (i >= a) {

					System.out.println(str.substring(10 * i));
					break;
				} else {
					System.out.println(str.substring(0 + (10 * i), 10 + (10 * i)));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

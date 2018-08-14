package algo.java;

import java.util.Scanner;

public class Q1110_AddCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n0=n, n1=0, n2=0, n3=0;
		int count =0;
		
		while(true) {
			n1 = n0/10;	//2
			n2 = n0%10;	//6
			n3 = n2*10+((n1+n2)%10); //새로운 숫자
			count++;	// 새로운 숫자가 생성될때 count 증가
			if(n==n3) {
				System.out.println(count);
				break;
			}
			else {
				n0 = n3;	// n0 = 68
			}
		}
	}
}

package algo.java;

import java.util.Scanner;

// 부제 : 평균은 넘겠지

//첫째 줄에는 테스트케이스의 개수 C가 주어진다.
// 둘째 줄부터 각 테스트케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
// 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
public class Q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // 테스트 갯수
		int n2 = 0;
		int[][] arr = new int[n1][];
		double[] avg = new double[n1];
		
		if(n1<1 || n1>1000) {
			System.out.println("1~1000값으로 입력해주세요.");
		}
		for(int i=0; i<n1; i++) { // 평균계산
			n2 = sc.nextInt();
			arr[i] = new int[n2];	//2차원배열이라 배열 한번더 선언
			for(int j=0; j<n2; j++) {
				arr[i][j] = sc.nextInt();
				avg[i] += arr[i][j];
			}
			avg[i] /= n2;	//각각의 평균값 계산
			int count =0;
			for(int j=0; j<n2; j++) {	// 평균넘는숫자 카운팅
				if(avg[i]<arr[i][j]) {
					count++;
				}
			}
			avg[i] = (double)count/n2*100;	// double로 형변환해서 저장해야 제대로 저장된다.
		}
		// 평균이 넘는 학생의 비율 출력
		for(int i=0; i<n1; i++) {
			System.out.printf("%.3f%%\n", avg[i]);	// '%' 사용 -> %%로 사용
		}
	}
}

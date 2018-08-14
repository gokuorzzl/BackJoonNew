package algo.java;

import java.util.Scanner;

// ���� : ����� �Ѱ���

//ù° �ٿ��� �׽�Ʈ���̽��� ���� C�� �־�����.
// ��° �ٺ��� �� �׽�Ʈ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
// ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
public class Q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // �׽�Ʈ ����
		int n2 = 0;
		int[][] arr = new int[n1][];
		double[] avg = new double[n1];
		
		if(n1<1 || n1>1000) {
			System.out.println("1~1000������ �Է����ּ���.");
		}
		for(int i=0; i<n1; i++) { // ��հ��
			n2 = sc.nextInt();
			arr[i] = new int[n2];	//2�����迭�̶� �迭 �ѹ��� ����
			for(int j=0; j<n2; j++) {
				arr[i][j] = sc.nextInt();
				avg[i] += arr[i][j];
			}
			avg[i] /= n2;	//������ ��հ� ���
			int count =0;
			for(int j=0; j<n2; j++) {	// ��ճѴ¼��� ī����
				if(avg[i]<arr[i][j]) {
					count++;
				}
			}
			avg[i] = (double)count/n2*100;	// double�� ����ȯ�ؼ� �����ؾ� ����� ����ȴ�.
		}
		// ����� �Ѵ� �л��� ���� ���
		for(int i=0; i<n1; i++) {
			System.out.printf("%.3f%%\n", avg[i]);	// '%' ��� -> %%�� ���
		}
	}
}

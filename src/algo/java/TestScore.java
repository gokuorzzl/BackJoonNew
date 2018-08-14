package algo.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 점수에 맞춰서 등급 출력 
public class TestScore {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n1 = Integer.parseInt(br.readLine());
			switch(n1/10) {
			case 10: case 9:
				bw.write('A'); break;
			case 8: bw.write('B'); break;
			case 7: bw.write('C'); break;
			case 6: bw.write('D'); break;
			default: bw.write('F'); break;
			}
			bw.flush();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

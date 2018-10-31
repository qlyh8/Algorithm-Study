package stage03_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [별찍기 - 1]
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * [입력]
 * 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 5
 *
 * [출력]
 * 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
 * *
 * **
 * ***
 * ****
 * *****
 * */
public class Q31_2438 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		
		for(int i=1 ; i<=N ; i++){
			builder.append("*");
			System.out.println(builder);
		}
	}
}

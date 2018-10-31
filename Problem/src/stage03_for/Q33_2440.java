package stage03_for;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [별찍기 - 3]
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 *
 * [입력]
 * 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 5
 *
 * [출력]
 * 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 * */
public class Q33_2440 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder builder;
		
		for(int i=0 ; i<N ; i++){
			builder = new StringBuilder();
			for(int j=0; j<N-i ; j++)
				builder.append("*");
			System.out.println(builder);
		}
	}
}

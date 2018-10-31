package stage03_for;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [별찍기 - 2]
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
 *
 * [입력]
 * 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 5
 *
 * [출력]
 * 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * */
public class Q32_2439 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		
		for(int i=1 ; i<=N ; i++){
			int j=1;
			for(; j<=N-i ; j++)
				builder.append(" ");
			for(; j<=N ; j++)
				builder.append("*");
			builder.append("\n");
		}
		
		System.out.println(builder);
	}
}

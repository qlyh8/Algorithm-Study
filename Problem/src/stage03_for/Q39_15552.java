package stage03_for;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [빠른 A+B]
 *
 * [입력]
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
 * 다음 T 줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 * 5
 * 1 1
 * 12 34
 * 5 500
 * 40 60
 * 1000 1000
 *
 * [출력]
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 * 2
 * 46
 * 505
 * 100
 * 2000
 * */
public class Q39_15552 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		
		for(int i=0 ; i<T ; i++){
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int A = Integer.parseInt(tokenizer.nextToken());
			int B = Integer.parseInt(tokenizer.nextToken());
			builder.append((A+B)).append("\n");
			
		}
		System.out.println(builder);
	}
}

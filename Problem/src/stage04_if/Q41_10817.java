package stage04_if;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * [세 수]
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 20 30 10
 * 30 30 10
 * 40 40 40
 * 20 10 10
 *
 * [출력]
 * 두 번째로 큰 정수를 출력한다.
 * 20
 * 30
 * 40
 * 10
 * */
public class Q41_10817 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int[] arr = new int[3];
		
		arr[0] = Integer.parseInt(tokenizer.nextToken());
		arr[1] = Integer.parseInt(tokenizer.nextToken());
		arr[2] = Integer.parseInt(tokenizer.nextToken());
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
	}
}

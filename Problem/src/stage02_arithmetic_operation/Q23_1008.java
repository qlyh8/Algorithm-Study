package stage02_arithmetic_operation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [A/B]
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 1 3
 * 4 5
 *
 * [출력]
 * 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
 * 0.33333333333333333333333333333333
 * 0.8
 * */
public class Q23_1008 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(tokenizer.nextToken());
		double B = Double.parseDouble(tokenizer.nextToken());
		System.out.println((A/B));
	}
}

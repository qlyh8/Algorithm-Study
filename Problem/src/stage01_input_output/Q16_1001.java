package stage01_input_output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [A-B]
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 3 2
 *
 * [출력]
 * 첫째 줄에 A-B를 출력한다.
 * 1
 * */
public class Q16_1001 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(tokenizer.nextToken());
		int B = Integer.parseInt(tokenizer.nextToken());
		System.out.println((A-B));
	}
}

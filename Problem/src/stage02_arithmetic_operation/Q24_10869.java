package stage02_arithmetic_operation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [사칙연산]
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 7 3
 *
 * [출력]
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 * 10
 * 4
 * 21
 * 2
 * 1
 * */
public class Q24_10869 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(tokenizer.nextToken());
		int B = Integer.parseInt(tokenizer.nextToken());
		System.out.println((A+B)+"\n"+(A-B)+"\n"+(A*B)+"\n"+(A/B)+"\n"+(A%B));
	}
}

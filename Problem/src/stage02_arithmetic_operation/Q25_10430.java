package stage02_arithmetic_operation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [나머지]
 * (A+B)%C는 (A%C + B%C)%C 와 같을까?
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 5 8 4
 *
 * [출력]
 * 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 * 1
 * 1
 * 0
 * 0
 * */
public class Q25_10430 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(tokenizer.nextToken());
		int B = Integer.parseInt(tokenizer.nextToken());
		int C = Integer.parseInt(tokenizer.nextToken());
		System.out.println(((A+B)%C)+"\n"+(((A%C)+(B%C))%C)+"\n"+(((A*B)%C)+"\n"+(((A%C)*(B%C))%C)));
	}
}

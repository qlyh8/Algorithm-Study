package stage02_arithmetic_operation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [A+B - 2]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 1 
 * 2
 *
 * [출력]
 * 첫째 줄에 A+B를 출력한다.
 * 3
 * */
public class Q26_2558 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		System.out.println((A+B));
	}
}

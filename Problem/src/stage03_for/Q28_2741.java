package stage03_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [N 찍기]
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 5
 *
 * [출력]
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * 1
 * 2
 * 3
 * 4
 * 5
 * */
public class Q28_2741 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		for(int i=1 ; i<=N ; i++)
			builder.append(i).append("\n");
		System.out.println(builder);
	}
}

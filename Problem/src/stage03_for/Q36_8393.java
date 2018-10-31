package stage03_for;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [합]
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 3
 *
 * [출력]
 * 1부터 n까지 합을 출력한다.
 * 6
 * */
public class Q36_8393 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int result = 0;
		for(int i=1 ; i<=n ; i++)
			result += i;
		System.out.println(result);
	}
}

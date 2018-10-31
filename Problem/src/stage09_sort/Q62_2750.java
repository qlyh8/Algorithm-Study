package stage09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [수 정렬하기]
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 * 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 5
 * 5
 * 2
 * 3
 * 4
 * 1
 *
 * [출력]
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 1
 * 2
 * 3
 * 4
 * 5
 * */
public class Q62_2750 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++)
			arr[i] = Integer.parseInt(reader.readLine());
		
		Arrays.sort(arr);
		
		StringBuilder builder = new StringBuilder();
		for(int i=0 ; i<N ; i++)
			builder.append(arr[i]).append("\n");
		
		System.out.println(builder);
	}
}

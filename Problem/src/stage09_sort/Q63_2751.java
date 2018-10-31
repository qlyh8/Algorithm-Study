package stage09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [수 정렬하기 2]
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 * 이 수는 절대값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 5
 * 5
 * 4
 * 3
 * 2
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
/**
 * 절대값이 1,000,000보다 작거나 같은 정수 => 배열을 2,000,001으로 만들어 1,000,000을 전후로 음수,양수로 나눔
 * check[Integer.parseInt(reader.readLine()) + 1000000] = true;
 * */
public class Q63_2751 {
	
	public static void main(String[] args) throws Exception {
		//solution1();
		solution2();
	}
	
	public static void solution1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
		
		for(int i=0 ; i<arr.length ; i++)
			arr[i] = Integer.parseInt(reader.readLine());
		
		Arrays.sort(arr);
		
		StringBuilder builder = new StringBuilder();
		for(int i=0 ; i<arr.length ; i++)
			builder.append(arr[i]).append("\n");
		
		System.out.println(builder);
	}
	
	private static void solution2() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		boolean[] check = new boolean[2000001];
		
		for(int i=0 ; i<N ; i++)
			check[Integer.parseInt(reader.readLine()) + 1000000] = true; 
		
		StringBuilder builder = new StringBuilder();
		for(int i=0 ; i<2000001 ; i++)
			if(check[i])
				builder.append(i-1000000).append("\n");
		
		System.out.println(builder);
	}
}

package stage09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [수 정렬하기 3]
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 * 10
 * 5
 * 2
 * 3
 * 1
 * 4
 * 2
 * 3
 * 5
 * 1
 * 7
 *
 * [출력]
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 1
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * 5
 * 5
 * 7
 * */
/**
 * 10,000보다 작거나 같은 자연수 & 오름차순 = 배열의 크기를 10000으로 만든 후, 중복 수 카운트 후 출력
 * */
public class Q64_10989 {
	
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
		int[] count = new int[10000];
		
		for(int i=0 ; i<N ; i++)
			count[Integer.parseInt(reader.readLine())-1]++; 
		
		StringBuilder builder = new StringBuilder();
		for(int i=0 ; i<10000 ; i++)
			for(int j=0 ; j<count[i] ; j++)
				builder.append(i+1).append("\n");
		
		System.out.println(builder);
	}
}

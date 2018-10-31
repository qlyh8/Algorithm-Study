package stage09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
 * [소트인사이드]
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 *
 * [입력]
 * 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 2143
 *
 * [출력]
 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * 4321
 * */
/**
 * string 내림차순: Comparator - "return o2.compareTo(o1);"
 * */
public class Q66_1427 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String N = reader.readLine();
		String[] arr = new String[N.length()];
		
		for(int i=0 ; i<arr.length ; i++)
			arr[i] = ""+N.charAt(i);
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		StringBuilder builder = new StringBuilder();
		for(int i=0 ; i<arr.length ; i++)
			builder.append(arr[i]);
		
		System.out.println(builder);
	}
}

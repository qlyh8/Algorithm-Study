package stage09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * [통계학]
 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다.
 * 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 * N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
 * 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절대값은 4,000을 넘지 않는다.
 * 5
 * 1
 * 3
 * 8
 * -2
 * 2
 *
 * [출력]
 * 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
 * 둘째 줄에는 중앙값을 출력한다.
 * 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
 * 넷째 줄에는 범위를 출력한다.
 * 2
 * 2
 * 1
 * 10
 * */
/**
 * 소수점 이하 첫째 자리에서 반올림: (int)Math.round((double)sum/N);
 * 최빈값 중 두 번째로 작은 값 출력: 몇 번 나왔는지 배열로 카운트하고, ArrayList 를 사용해 여러 개의 최빈값을 저장
 * */
public class Q65_2108 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
		int[] check = new int[8001];
		int sum = 0;
	
		for(int i=0 ; i<N ; i++){
			arr[i] =  Integer.parseInt(reader.readLine());
			check[arr[i]+4000]++;
			sum += arr[i];
		}
		
		int maxIndex = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0 ; i<8001 ; i++){
			if(check[maxIndex] < check[i]){
				maxIndex = i;
				list.clear();
			}
			else if(check[i]!=0 && check[i]==check[maxIndex]){
				list.add(i-4000);
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(arr[N/2]);
		if(list.size()!=0)
			System.out.println(list.get(0));
		else
			System.out.println(maxIndex-4000);
		System.out.println(arr[N-1]-arr[0]);
	}
}

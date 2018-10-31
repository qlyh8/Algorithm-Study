package stage10_prime_number;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [소수 찾기]
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 4
 * 1 3 5 7
 *
 * [출력]
 * 주어진 수들 중 소수의 개수를 출력한다.
 * 3
 * */
/**
 * 기본 원리:2부터 num-1의 수로 나눌 때, 나눠지는 수가 있으면 소수가 아님
 * 더 나아가서: 2부터 sqrt(num)의 수로 나눌 때, 나눠지는 수가 있으면 소수가 아님
 *  -> '나누는 수'와 '몫' 중 하나는 반드시 sqrt(num)이하이기 때문
 * */
public class Q68_1978 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] arr = reader.readLine().split(" ");
		int result = 0;
		
		for(int i=0 ; i<N ; i++){
			int num = Integer.parseInt(arr[i]);
			if(num == 1)
				continue;

			boolean isPrime = true;
			for(int j=2; j<=(int)Math.sqrt(num) ; j++){
				if(num%j == 0){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
				result++;
		}
		
		System.out.println(result);
	}
}
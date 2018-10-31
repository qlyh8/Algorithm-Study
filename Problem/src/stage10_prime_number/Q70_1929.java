package stage10_prime_number;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [소수 구하기]
 * M이상 N 이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
 * 3 16
 *
 * [출력]
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 * 3
 * 5
 * 7
 * 11
 * 13
 * */
/**
 * 모든 자연수는 소수들의 곱으로 표현이 되기 때문에,
 * 2부터 N-1까지의 수 중에서 2의 배수를 모두 체로 거르고 남은 숫자들 중에서 3의 배수로 거르고를 반복해
 * sqrt(N)까지 나눠서 남은 걸러지지 않고 남은 수들이 모두 소수가 된다.
 * 참고) http://ledgku.tistory.com/61
 * */
public class Q70_1929 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = reader.readLine().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		StringBuilder builder = new StringBuilder();
		
		boolean[] isPrimeArr = new boolean[N+1];
		Arrays.fill(isPrimeArr, true);
		isPrimeArr[0] = false;
		isPrimeArr[1] = false;
		
		for(int i=2 ; i<=(int)Math.sqrt(N) ; ++i) {
	        if (isPrimeArr[i]){
	            for (int j=i+i; j<=N; j+=i)
	                isPrimeArr[j] = false;
	        }
	    }
		
		for(int i=M ; i<=N ; i++){
			if(isPrimeArr[i])
				builder.append(i).append("\n");
		}
		
		System.out.println(builder);
	}
}
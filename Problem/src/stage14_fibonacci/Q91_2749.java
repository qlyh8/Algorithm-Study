package stage14_fibonacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [피보나치 수 3]
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
 * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.
 * 1000
 *
 * [출력]
 * 첫째 줄에 n번째 피보나치 수를 1,000,000으로 나눈 나머지를 출력한다.
 * 228875
 * */
// https://png93.github.io/baekjoon-2749-fibonacci/ 참조
// 피보나치 수를 나눈 나머지가 항상 주기를 가진다. 이를 피사노 주기(Pisano Period)라 한다.
// 피보나치 수를 나눌 수를 K라고 할 때, k=10^n 이면, 피사노 주기는 15∗10^(n−1)이다.
// 즉, k=1,000,000 (10^6)이면 피사노 주기는 1,500,000
// 1,500,000번째 까지의 피보나치 수를 10^6로 나눈 나머지 값들을 구하면 그 이후의 수는 계산할 필요가 없다.
public class Q91_2749 {
    public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        int pisano = 1500000;
        long[] arr = new long[pisano];
        arr[0] = 0; arr[1] = 1;

        for(int i=2 ; i<pisano && i<=n ; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000;
        }

        if(n >=pisano){
            n %= pisano;
        }

        System.out.println(arr[(int) n]);
	}
}
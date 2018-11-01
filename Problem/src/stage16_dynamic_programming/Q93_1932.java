package stage16_dynamic_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * [정수 삼각형]
 * 위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
 * 맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때,
 * 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
 * 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
 * 삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
 *
 * [입력]
 * 첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
 * 5
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 *
 * [출력]
 * 첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
 * 30
 * */
// arr[i][j] += Math.max((j==0) ? 0 : arr[i-1][j-1], arr[i-1][j]);
public class Q93_1932 {
    public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n][n];

        StringTokenizer tokenizer;
        for(int i=0 ; i<n ; i++){
            tokenizer = new StringTokenizer(reader.readLine());
            for(int j=0 ; j<i+1 ; j++){
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<i+1 ; j++){
                // left(arr[i-1][j-1]) 값과 right(arr[i-1][j]) 값 중 큰 값을 arr[i][j] 값에 더한다.
                arr[i][j] += Math.max((j==0) ? 0 : arr[i-1][j-1], arr[i-1][j]);
            }
        }

        Arrays.sort(arr[n-1]);
        System.out.println(arr[n-1][n-1]);
	}
}
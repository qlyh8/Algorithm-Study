package stage16_dynamic_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [RGB거리]
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다.
 * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다.
 * 처음 집과 마지막 집은 이웃이 아니다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때,
 * 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다.
 * 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다.
 * 비용은 1,000보다 작거나 같은 자연수이다.
 * 3
 * 26 40 83
 * 49 60 57
 * 13 89 99
 *
 * [출력]
 * 첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.
 * 96
 * */
// 세 이웃 간 색깔이 달라야 하는 것이 아니라, 두 이웃 간 색깔이 다르면 된다. (ex: 빨 초 빨)
// 두 번째 집부터 빨강, 초록, 파랑으로 칠할 때의 비용을 구한다.
// 빨강 두 번째 집 = min(첫 번째 집을 초록으로 칠할 때 비용, 첫 번째 집을 파랑으로 칠할 때 비용)
//                  + 두 번째 집을 빨강으로 칠할 때 비용
//  cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
public class Q92_1149 {
    public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[][] cost = new int[N][3];

        for(int i=0 ; i<N ; i++){
            String[] input = reader.readLine().split(" ");
            cost[i][0] = Integer.parseInt(input[0]);
            cost[i][1] = Integer.parseInt(input[1]);
            cost[i][2] = Integer.parseInt(input[2]);
        }

        for(int i=1 ; i<N ; i++){
            // 해당 집의 색(ex:빨강)을 제외한 나머지 색들(ex:초록,파랑)의 비용 중 최소값을 해당 집의 비용과 더함
            cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] += Math.min(cost[i-1][0], cost[i-1][1]);
        }

        Arrays.sort(cost[N-1]);
        System.out.println(cost[N-1][0]);
	}
}
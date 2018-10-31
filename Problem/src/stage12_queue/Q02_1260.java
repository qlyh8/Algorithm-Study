package stage12_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
 * [DFS 와 BFS]
 * 그래프를 DFS 로 탐색한 결과와 BFS 로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
 * 정점 번호는 1번부터 N 번까지이다.
 *
 * [입력]
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
 * 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
 * 한 간선이 여러 번 주어질 수도 있는데, 간선이 하나만 있는 것으로 생각하면 된다. 입력으로 주어지는 간선은 양방향이다.
 * 4 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 * [출력]
 * 첫째 줄에 DFS 를 수행한 결과를, 그 다음 줄에는 BFS 를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
 * 1 2 4 3
 * 1 2 3 4
 * */
/**
 * 기본이고 꼭 알아야 하는 문제
 * */
public class Q02_1260 {
    private static int N;
    private static int[][] W;
    private static boolean[] visit;

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		StringBuilder builder = new StringBuilder();

        N = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);
        W = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i = 0; i< m; i++){
            String[] edge = reader.readLine().split(" ");
            int N1 = Integer.parseInt(edge[0]);
            int N2 = Integer.parseInt(edge[1]);
            W[N1][N2] = 1;
            W[N2][N1] = 1;
        }

        dfs(v);

        System.out.print("\n");
        for(int i=0 ; i<visit.length ; i++)
            visit[i] = false;

        bfs(v);

		System.out.println(builder);
	}

    private static void dfs(int num){
        System.out.print(num + " ");
        visit[num] = true;

        for(int i=1 ; i<=N ; i++){
            if(W[num][i]==1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int num){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);
        visit[num] = true;

        while(!queue.isEmpty()){
            int front = queue.peek();
            queue.poll();

            System.out.print(front + " ");

            for(int i=1 ; i<=N ; i++){
                if(W[front][i]==1 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
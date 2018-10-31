package stage24_dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
* [미로 탐색]
* N×M 크기의 배열로 표현되는 미로가 있다.
* 1 0	1	1	1	1
* 1	0	1	0	1	0
* 1	0	1	0	1	1
* 1	1	1	0	1	1
* 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
* 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
* 위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
*
* [입력]
* 첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다.
* 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.
* 4 6
* 101111
* 101010
* 101011
* 111011
*
* [출력]
* 첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
* 15
* */
public class Q86_2178 {
    private static int N, M;
    private static int[][] miro;
    private static boolean[][] visit;
    private static int[] dirX = {0, 1, 0, -1};
    private static int[] dirY = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        miro = new int[N][M];
        visit = new boolean[N][M];

        for(int i=0 ; i<N ; i++){
            String inputLine = reader.readLine();
            for(int j=0 ; j<M ; j++){
                miro[i][j] = inputLine.charAt(j)-'0';
            }
        }

        bfs(new Position(0, 0, 1));
    }

    private static void bfs(Position position){
        Queue<Position> queue = new LinkedList<>();
        queue.offer(position);
        visit[position.getN()][position.getM()] = true;

        while(!queue.isEmpty()){
            Position front = queue.poll();

            if(front.getN() == N-1 && front.getM() == M-1){
                System.out.println(front.count);
                return;
            }

            for(int i=0 ; i<4 ; i++){
                int newN = front.getN() + dirY[i];
                int newM = front.getM() + dirX[i];

                if((0 <= newN && newN < N) && (0 <= newM && newM < M)){
                    if(miro[newN][newM] == 1 && !visit[newN][newM]){
                        visit[newN][newM] = true;
                        queue.offer(new Position(newN, newM, front.getCount()+1));
                    }
                }
            }
        }
    }

    public static class Position{
        int n, m, count;

        Position(int n, int m, int count) {
            this.n = n;
            this.m = m;
            this.count = count;
        }

        int getN(){return n;}

        int getM(){return m;}

        int getCount(){return count;}
    }
}

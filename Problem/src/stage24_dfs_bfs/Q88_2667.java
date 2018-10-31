package stage24_dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
* [단지번호붙이기]
* <그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다.
* 철수는 이 지도를 가지고 연결된 집들의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다.
* 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다.
* 대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다.
* 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
*
* [입력]
* 첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고,
* 그 다음 N 줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
* 7
* 0110100
* 0110101
* 1110101
* 0000111
* 0100000
* 0111110
* 0111000
*
* [출력]
* 첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
* 3
* 7
* 8
* 9
* */
public class Q88_2667 {
    private static int N, count = 1;
    private static int[][] map;
    private static int[] dirX = {0, 1, 0, -1};
    private static int[] dirY = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());
        map = new int[N][N];

        for(int i=0 ; i<N ; i++){
            String input = reader.readLine();
           for(int j=0 ; j<N ; j++){
               map[i][j] = input.charAt(j) - '0';
           }
        }

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<N ; j++){
                if(map[i][j] == 1){
                    bfs(new Position(i, j, ++count));
                }
            }
        }

        int[] danji = new int[count-1];
        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<N ; j++){
                if(map[i][j] > 1){
                    danji[map[i][j]-2]++;
                }
            }
        }

        Arrays.sort(danji);

        StringBuilder builder = new StringBuilder();
        builder.append(count-1).append("\n");
        for (int aDanji : danji) {
            builder.append(aDanji).append("\n");
        }

        System.out.println(builder);
    }

    private static void bfs(Position position){
        Queue<Position> queue = new LinkedList<>();
        queue.offer(position);

        while(!queue.isEmpty()){
            Position front = queue.poll();
            map[front.getY()][front.getX()] = front.getCount();

            for(int i=0 ; i<4 ; i++){
                int newY = front.getY() + dirY[i];
                int newX = front.getX() + dirX[i];

                if((0 <= newY && newY < N) && (0 <= newX && newX < N)){
                    if(map[newY][newX] == 1){
                        map[newY][newX] = front.getCount();
                        queue.offer(new Position(newY, newX, front.getCount()));
                    }
                }
            }

            /*for(int i=0 ; i<N ; i++){
                for(int j=0 ; j<N ; j++){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");*/
        }
    }

    public static class Position{
        int y, x, count;

        Position(int y, int x, int count) {
            this.y = y;
            this.x = x;
            this.count = count;
        }

        int getY(){return y;}

        int getX(){return x;}

        int getCount(){return count;}
    }
}

package stage20_divide_conquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [종이의 개수]
 * N×N 크기의 행렬로 표현되는 종이가 있다. 종이의 각 칸에는 -1, 0, 1의 세 값 중 하나가 저장되어 있다.
 * 우리는 이 행렬을 적절한 크기로 자르려고 하는데, 이때 다음의 규칙에 따라 자르려고 한다.
 * 만약 종이가 모두 같은 수로 되어 있다면 이 종이를 그대로 사용한다.
 * (1)이 아닌 경우에는 종이를 같은 크기의 9개의 종이로 자르고, 각각의 잘린 종이에 대해서 (1)의 과정을 반복한다.
 * 이와 같이 종이를 잘랐을 때,
 * -1로만 채워진 종이의 개수, 0으로만 채워진 종이의 개수, 1로만 채워진 종이의 개수를 구해내는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 N(1≤N≤3^7, N은 3^k 꼴)이 주어진다. 다음 N개의 줄에는 N개의 정수로 행렬이 주어진다.
 *
 * [출력]
 * 첫째 줄에 -1로만 채워진 종이의 개수를, 둘째 줄에 0으로만 채워진 종이의 개수를, 셋째 줄에 1로만 채워진 종이의 개수를 출력한다.
 * */
/**
 * int[] num = new int[3];	// -1, 0 ,1
 * cut(size/3, startX + j*(size/3), startY + i*(size/3));
 * */
public class Q09_1780 {
    private static int[][] arr;
    private static int[] num = new int[3];	// -1, 0 ,1

    public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        arr = new int[N][N];

        for(int i=0 ; i<N ; i++){
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for(int j=0 ; j<N ; j++){
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        cut(N, 0, 0);

        for(int i=0 ; i<3 ; i++)
            System.out.println(num[i]);
	}

    private static boolean equal(int size, int startX, int startY){
        int target = arr[startY][startX];

        for(int i=startY ; i<startY+size ; i++){
            for(int j=startX ; j<startX+size ; j++){
                if(target != arr[i][j]){
                    return false;
                }
            }
        }

        num[target+1]++;
        return true;
    }

    private static void cut(int size, int startX, int startY){
        if(equal(size, startX, startY))
            return;

        for(int i=0 ; i<3 ; i++)
            for(int j=0 ; j<3 ; j++)
                cut(size/3, startX + j*(size/3), startY + i*(size/3));
    }
}
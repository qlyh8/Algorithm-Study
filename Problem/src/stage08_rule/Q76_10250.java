package stage08_rule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [ACM 호텔]
 * ACM 호텔 매니저 지우는 손님이 도착하는 대로 빈 방을 배정하고 있다. 
 * 손님은 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다. 다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호한다. 
 * 예를 들면 102 호 방보다는 301 호 방을 더 선호하는데, 102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문이다. 
 * 같은 이유로 102 호보다 2101 호를 더 선호한다.
 * 여러분이 작성할 프로그램은 초기에 모든 방이 비어있다고 가정하에
 * 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다.
 * 첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 
 * 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.
 *
 * [입력]
 * 프로그램은 표준 입력에서 입력 데이터를 받는다. 
 * 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다. 
 * 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다
 * (1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W). 
 * 2
 * 6 12 10
 * 30 50 72
 *
 * [출력]
 * 프로그램은 표준 출력에 출력한다. 
 * 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
 * 402
 * 1203
 * */
/**
 * 참고) http://wookje.dance/2017/09/21/boj-10250-ACM-%ED%98%B8%ED%85%94/
 * String number = String.format("%d%02d", N % H + 1, N / H + 1);
 * */
public class Q76_10250 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		
		for(int i=0 ; i<T ; i++){
			String[] input = reader.readLine().split(" ");
			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);
			int N = Integer.parseInt(input[2]) - 1;
			String number = String.format("%d%02d", N % H + 1, N / H + 1);
			builder.append(number).append("\n");
		}
		
		System.out.println(builder);
	}
}
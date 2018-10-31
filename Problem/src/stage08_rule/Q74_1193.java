package stage08_rule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [분수찾기]
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
 * 1/1	1/2	1/3	1/4	1/5	…
 * 2/1	2/2	2/3	2/4	…	…
 * 3/1	3/2	3/3	…	…	…
 * 4/1	4/2	…	…	…	…
 * 5/1	…	…	…	…	…
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로
 * 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * 14
 *
 * [출력]
 * 첫째 줄에 분수를 출력한다.
 * 2/4
 * */
/**
 * (1/1) (1/2 2/1) (3/1 2/2 1/3) (1/4 2/3 3/2 4/1) (5/1 4/2 3/3 2/4 1/5) (1/6 ..
 *   1    2   3      4   5   6    7   8    9   10    11 12  13   14  15   16
 * 1, 2, 4, 7, 11, 16
 *
 * */
public class Q74_1193 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(reader.readLine());
		int start = 1, term = 1;
		
		while(true){
			if(start <= X && X < start+term){
				for(int i=start, j=0 ; i<start+term ; i++, j++){
					if(i == X){
						if(term%2 == 1){
							System.out.println((term-j) + "/" + (1+j));
							return;
						}
						else {
							System.out.println((1+j) + "/" + (term-j));
							return;
						}
					}
				}
			}
			else{
				start += term;
				term++;
			}
		}
	}
}
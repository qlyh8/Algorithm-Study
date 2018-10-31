package stage04_if;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [시험 성적]
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 100
 *
 * [출력]
 * 시험 성적을 출력한다.
 * A
 * */
public class Q40_9498 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(reader.readLine());
	
		if(score < 60)
			System.out.println("F");
		else if(score < 70)
			System.out.println("D");
		else if(score < 80)
			System.out.println("C");
		else if(score < 90)
			System.out.println("B");
		else
			System.out.println("A");
	}
}

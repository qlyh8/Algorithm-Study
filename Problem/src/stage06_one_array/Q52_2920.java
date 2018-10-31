package stage06_one_array;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [음계]
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.
 * c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending 인지, descending 인지, 아니면 mixed 인지 판별하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 * 1 2 3 4 5 6 7 8
 * 8 7 6 5 4 3 2 1
 * 8 1 7 2 6 3 5 4
 *
 * [출력]
 * 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 * ascending
 * descending               
 * mixed
 * */
public class Q52_2920 {
	// https://www.acmicpc.net/source/7557796 코드 참고
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		if(input.equals("1 2 3 4 5 6 7 8"))
			System.out.println("ascending");
		else if(input.equals("8 7 6 5 4 3 2 1"))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
	
	public static void sound(String input){
		String[] arr = input.split(" ");
		
		if(arr[0].equals("1")){
			for(int i=2 ; i<=8 ; i++){
				if(!arr[i-1].equals(String.valueOf(i))){
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("ascending");
		}
		else if(arr[0].equals("8")) {
			for(int i=2, j=7 ; i<=8 ; i++, j--){
				if(!arr[i-1].equals(String.valueOf(j))){
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}

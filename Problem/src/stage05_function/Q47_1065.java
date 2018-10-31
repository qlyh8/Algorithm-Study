package stage05_function;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [한수]
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 110
 *
 * [출력]
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 * 99
 * */
public class Q47_1065 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		if(N < 100){
			System.out.println(N);
        }
		else {
			int result = 99;
			
			for(int i=100 ; i<=N ; i++){
				int diff1 = (String.valueOf(i).charAt(1)-'0') - (String.valueOf(i).charAt(0)-'0'); 
				int diff2 = (String.valueOf(i).charAt(2)-'0') - (String.valueOf(i).charAt(1)-'0');
				
				if(diff1 == diff2)
					result++;
			}
			
			System.out.println(result);
		}
	}
}

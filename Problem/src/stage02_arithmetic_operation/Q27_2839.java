package stage02_arithmetic_operation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [설탕 배달]
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N 킬로그램을 배달해야 한다.
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N 킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
 * 18
 * 4
 * 6
 * 9
 * 11
 *
 * [출력]
 * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N 킬로그램을 만들 수 없다면 -1을 출력한다.
 * 4
 * -1
 * 2
 * 3
 * 3
 * */
/**
 * 최소 봉지 개수를 구해야 하므로, 5 킬로그램 봉지로 먼저 담고, 남은 것을 3킬로그램 봉지에 담아야 한다.
 * N을 5로 나눴을 때 나머지가 없다면, 이는 5 킬로그램 봉지에 모두 담을 수 있다.
 * 그렇지 않다면, N -= 3을 해주어 3킬로그램 봉지에 담는다.
 * 만약, N의 나머지가 3 미만이라면 N -=3 을 했을 때 값이 음수가 나온다. (3 킬로그램 봉지에 담을 수 없어, 정확하게 만들 수 없다.)
 * */
public class Q27_2839 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int count = 0;
		
		while(N%5 != 0 && N > 0){
			N -= 3;
			count++;
		}
		
		if(N<0)
			System.out.println(-1);
		else
			System.out.println(count + N/5);
	}
}

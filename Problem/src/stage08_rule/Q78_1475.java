package stage08_rule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [방 번호]
 * 다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
 * 다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
 * 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오.
 * (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
 *
 * [입력]
 * 첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수 또는 0이다.
 * 9999
 *
 * [출력]
 * 첫째 줄에 필요한 세트의 개수를 출력한다.
 * 2
 * */
public class Q78_1475 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String N = reader.readLine();
		int[] number = new int[10];
		
		for(int i=0 ; i<N.length() ; i++)
			number[N.charAt(i)-'0']++;
		
		int result = 0;
		int sixNine = (number[6]+number[9]) / 2 + (number[6]+number[9]) % 2;
		
		for(int i=0 ; i<10 ; i++){
			if(i==6 || i==9)
				continue;
			
			if(result < number[i])
				result = number[i];
		}
		
		if(result < sixNine)
			result = sixNine;
		
		System.out.println(result);
	}
}
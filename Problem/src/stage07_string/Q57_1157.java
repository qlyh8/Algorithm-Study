package stage07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [단어 공부]
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 *
 * [입력]
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * Mississipi
 * zZa
 * z
 * baaa
 *
 * [출력]
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * ?
 * Z
 * Z
 * A
 * */
public class Q57_1157 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine().toUpperCase();
		int[] arr = new int[26];
		
		for(int i=0 ; i<input.length() ; i++)
			arr[input.charAt(i)-65]++;
		
		int max = 0; 
		boolean isSame = false;
		int index = 0;
		
		for(int i=0 ; i<arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
				isSame = false;
				index = i;
			}
			else if(max == arr[i]){
				isSame = true;
			}
		}
		
		if(isSame)
			System.out.println("?");
		else
			System.out.println((char)(index+65));
	}
}

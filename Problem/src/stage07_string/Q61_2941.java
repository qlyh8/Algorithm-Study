package stage07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * [크로아티아 알파벳]
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.
 * c= c- dz= d- lj nj s= z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 *
 * [입력]
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 * 문제 설명에 나와있는 크로아티아 알파벳만 주어진다.
 * ljes=njak
 * ddz=z=
 * nljj
 * c=c=
 *
 * [출력]
 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * 6
 * 3
 * 3
 * 2
 * */
/**
 * 문자열 3개짜리와 2개짜리 구별
 * if (input.length() >= i+3 && isContain(i, i+3)) { i = i+2;  continue; }
 * */
public class Q61_2941 {
	private static String input = "";
	private static int count = 0;
	private static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		input = reader.readLine();
		list.add("c="); list.add("c-"); list.add("dz="); list.add("d-");
		list.add("lj"); list.add("nj"); list.add("s="); list.add("z=");
		
		for(int i=0 ; i<input.length() ; i++){
			if (input.length() >= i+3 && isContain(i, i+3)) {
				i = i+2;
				continue;
			}
			if (input.length() >= i+2 && isContain(i, i+2)) {
				i = i+1;
				continue;
			}
			count++;
		}
		
		System.out.println(count);
	}
	
	private static boolean isContain(int start, int end){
		String word = input.substring(start, end);
		
		if(list.contains(word)){
			count++;
			return true;
		}
		else{
			return false;
		}
	}
}

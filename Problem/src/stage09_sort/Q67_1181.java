package stage09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
 * [단어 정렬]
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 * 길이가 짧은 것부터, 길이가 같으면 사전 순으로
 *
 * [입력]
 * 첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
 * 주어지는 문자열의 길이는 50을 넘지 않는다.
 * 13
 * but
 * i
 * wont
 * hesitate
 * no
 * more
 * no
 * more
 * it
 * cannot
 * wait
 * im
 * yours
 *
 * [출력]
 * 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 * i
 * im
 * it
 * no
 * but
 * more
 * wait
 * wont
 * yours
 * cannot
 * hesitate
 * */
/**
 * 가급적 ArrayList 보다 Array 를 사용하여 정렬하기, 중복 제외할 땐 입력시 제외하지 말고 정렬 후 제외시킬 것
 * */
public class Q67_1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] arr = new String[N];
		
		for(int i=0 ; i<N ; i++)
			arr[i] = reader.readLine();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
					return 1;
				else if(o1.length() < o2.length())
					return -1;
				else 
					return o1.compareTo(o2);
			}
		});
		
		StringBuilder builder = new StringBuilder();
		String str = "";
		
		for(int i=0 ; i<arr.length ; i++){
			if(!arr[i].equals(str)){
				builder.append(arr[i]).append("\n");
				str = arr[i];
			}
		}
		
		System.out.println(builder);
	}
}
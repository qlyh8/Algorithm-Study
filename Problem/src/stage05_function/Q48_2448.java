package stage05_function;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [별찍기 - 11]
 * 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 * [입력]
 * 첫째 줄에 N이 주어진다. N은 항상 3*2^k 수이다. (3, 6, 12, 24, 48, ...) (k<=10)
 * 3
 *
 * [출력]
 * 첫째 줄부터 N번째 줄까지 별을 출력한다.
 *   *  
 *  * *                       
 * *****  
 * */
/**
 * 어렵다.
 * 참고) http://developer-syubrofo.tistory.com/33
 * */
public class Q48_2448 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		String[] star = new String[N];
		star[0] = "  *  ";
		star[1] = " * * ";
		star[2] = "*****";
		
		String space = "   ";
		for(int i=3, k=1 ; i<N ; i<<=1, k<<=1){
			for(int j=0 ; j<i ; j++) {
			  star[i+j] = star[j] + " " + star[j];
			  star[j] = space + star[j] + space;
			} 
			
			for(int j=0 ; j<k ; j++)
			  space += "   ";
		}
		
		StringBuilder builder = new StringBuilder();
		for(int i=0 ; i<star.length ; i++)
			builder.append(star[i]).append("\n");
		
		System.out.println(builder);
	}
}

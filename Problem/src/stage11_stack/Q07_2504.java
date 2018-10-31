package stage11_stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
* [괄호의 값]
* 4개의 기호 ‘(’, ‘)’, ‘[’, ‘]’를 이용해서 만들어지는 괄호열 중에서 올바른 괄호열이란 다음과 같이 정의된다.
* 한 쌍의 괄호로만 이루어진 ‘()’와 ‘[]’는 올바른 괄호열이다. 만일 X가 올바른 괄호열이면 ‘(X)’이나 ‘[X]’도 모두 올바른 괄호열이 된다.
* X와 Y 모두 올바른 괄호열이라면 이들을 결합한 XY도 올바른 괄호열이 된다.
* 예를 들어 ‘(()[[]])’나 ‘(())[][]’ 는 올바른 괄호열이지만 ‘([)]’ 나 ‘(()()[]’ 은 모두 올바른 괄호열이 아니다.
* 우리는 어떤 올바른 괄호열 X에 대하여 그 괄호열의 값(괄호값)을 아래와 같이 정의하고 값(X)로 표시한다.
* ‘()’ 인 괄호열의 값은 2이다.
* ‘[]’ 인 괄호열의 값은 3이다.
* ‘(X)’ 의 괄호값은 2×값(X) 으로 계산된다.
* ‘[X]’ 의 괄호값은 3×값(X) 으로 계산된다.
* 올바른 괄호열 X와 Y가 결합된 XY의 괄호값은 값(XY)= 값(X)+값(Y) 로 계산된다.
* 예를 들어 ‘(()[[]])([])’ 의 괄호값을 구해보자.
* ‘()[[]]’ 의 괄호값이 2 + 3×3=11 이므로  ‘(()[[ ]])’의 괄호값은 2×11=22 이다.
* 그리고  ‘([])’의 값은 2×3=6 이므로 전체 괄호열의 값은 22 + 6 = 28 이다.
* 여러분이 풀어야 할 문제는 주어진 괄호열을 읽고 그 괄호값을 앞에서 정의한대로 계산하여 출력하는 것이다.
*
* [입력]
* 첫째 줄에 괄호열을 나타내는 문자열(스트링)이 주어진다. 단 그 길이는 1 이상, 30 이하이다.
* (()[[]])([])
*
* [출력]
* 첫째 줄에 그 괄호열의 값을 나타내는 정수를 출력한다. 만일 입력이 올바르지 못한 괄호열이면 반드시 0을 출력해야 한다.
* 28
* */
/**
 * 어렵다.. 주석 참고
 * */
public class Q07_2504 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		int value = 0; 
		Stack<String> stack = new Stack<>();
		stack.push(String.valueOf(input.charAt(0)));
		
		for(int i=1 ; i<input.length() ; i++){
			String str = String.valueOf(input.charAt(i));
		
			if(str.equals("(") || str.equals("[")){	// 여는 괄호일 때 스택에 넣음
				stack.push(str);
			}
			else if(str.equals(")")){	// 닫는 괄호가 ')' 일때
				if(stack.peek().equals("(")){ // 중첩된 괄호가 아니라면 스택에 '2'를 넣는다.
					stack.pop();
					stack.push("2");
				}
				else{
					int tmp = 0;
					while (!stack.isEmpty()) { // 여는 괄호가 나올 때까지 더하고, 여는 괄호가 나오면 *2
						String pop = stack.pop();
						if(pop.equals(")") || pop.equals("[") || pop.equals("]")){
							System.out.println(0);
							return;
						}
						if(pop.equals("(")){
							stack.push(String.valueOf(tmp*2));
							break;
						}
						tmp += Integer.parseInt(pop);
					}
					if(stack.isEmpty()){    // 괄호 짝이 맞지 않음
						System.out.println(0);
						return;
					}
				}
			}
			else if(str.equals("]")){	// 닫는 괄호가 ']' 일때
				if(stack.peek().equals("[")){ // 중첩된 괄호가 아니라면 스택에 '3'를 넣는다.
					stack.pop();
					stack.push("3");
				}
				else{
					int tmp = 0;
					while (!stack.isEmpty()) {	// 여는 괄호가 나올 때까지 더하고, 여는 괄호가 나오면 *3
						String pop = stack.pop();
						if(pop.equals("(") || pop.equals(")") || pop.equals("]")){
							System.out.println(0);
							return;
						}	
						if(pop.equals("[")){
							stack.push(String.valueOf(tmp*3));
							break;
						}
						tmp += Integer.parseInt(pop);
					}
					if(stack.isEmpty()){	// 괄호 짝이 맞지 않음
						System.out.println(0);
						return;
					}
				}
			}
			else {	// 괄호가 아닌 값이 들어옴
				System.out.println(0);
				return;
			}
		}
		
		while(!stack.isEmpty()){	// 스택의 있는 값을 모두 더한다.
			String str = stack.pop();
			if(str.equals("(") || str.equals(")") || str.equals("[") || str.equals("]")){
				System.out.println(0);
				return;
			}
			value += Integer.parseInt(str);
		}
		System.out.println(value);	// 결과 출력
	}
}

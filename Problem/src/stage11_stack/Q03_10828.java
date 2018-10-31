package stage11_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* [스택]
* 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오. 명령은 총 다섯 가지이다.
* push X: 정수 X를 스택에 넣는 연산이다.
* pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
* size: 스택에 들어있는 정수의 개수를 출력한다.
* empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
* top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*
* [입력]
* 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
* 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
*
* [출력]
* 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
* */
public class Q03_10828 {
    private static StringBuilder strBuilder;
    private static int stackSize = 0;
	private static int[] stackArr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		strBuilder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());
		stackArr = new int[n];
		
		for(int i = 0; i< n; i++){
			stack(reader.readLine());
		}

		System.out.println(strBuilder);
	}
	
	private static void stack(String command){
        StringTokenizer tokenizer = new StringTokenizer(command);
		
		switch(tokenizer.nextToken()){
			case "push":
				push(Integer.parseInt(tokenizer.nextToken()));
				break;
			case "pop":
				strBuilder.append(pop()).append("\n");
				break;
			case "size":
				strBuilder.append(size()).append("\n");
				break;
			case "empty":
				if(empty())
					strBuilder.append("1\n");
				else
					strBuilder.append("0\n");
				break;
			case "top":
				strBuilder.append(top()).append("\n");
				break;
			default:
				break;
		}
	}

	private static void push(int num){
		stackArr[++stackSize] = num;
	}

	private static int pop(){
		int num = -1;

		if(stackSize == 0) {
            return num;
        }
		else{
			num = stackArr[stackSize];
			stackArr[stackSize--] = 0;
			return num;
		}
	}

	private static int size(){
		return stackSize;
	}

	private static boolean empty(){
        return stackSize == 0;
	}

	private static int top(){
		if(stackSize == 0)
			return -1;
		else
			return stackArr[stackSize];
	}
}

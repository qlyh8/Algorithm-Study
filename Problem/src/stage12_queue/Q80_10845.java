package stage12_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/*
 * [큐]
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 여섯 가지이다.
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *
 * [입력]
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * [출력]
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * */
/**
 * 링크드리스트로!
 * LinkedList 의 대부분의 함수가 ArrayList 처럼 임의의 인덱스에 접근 할 수 있는 것과 더불어
 * ~First, ~Last 접미어를 붙여 만든 함수로 순차적 기능을 강조한 함수들이 많다.
 * peek() 함수는 LinkedList 에 element 가 없을때, 예외를 발생시키지 않고 null 을 리턴한다.
 * 그러나 getFirst() 함수는 NoSuchElementExcpetion 예외를 일으킨다.
 * */
public class Q80_10845 {
	private static LinkedList<Integer> list = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
			
		for(int i=0 ; i<N ; i++){
			String[] input = reader.readLine().split(" ");
			switch (input[0]) {
			case "push":
				push(Integer.parseInt(input[1]));
				break;
			case "pop":
				builder.append(pop()).append("\n");
				break;
			case "size":
				builder.append(size()).append("\n");
				break;
			case "empty":
				builder.append(empty()).append("\n");
				break;
			case "front":
				builder.append(front()).append("\n");
				break;
			case "back":
				builder.append(back()).append("\n");
				break;
			default:
				break;
			}
		}
		System.out.println(builder);
	}
	
	private static void push(int x){
		list.add(x);
	}
	
	private static int pop(){
		if(list.isEmpty()) {
            return -1;
        } else {
            return list.pollFirst();
        }
	}
	
	private static int size(){
		return list.size();
	}
	
	private static int empty(){
		if(list.isEmpty())
			return 1;
		else
			return 0;
	}
	
	private static int front(){
		if(list.isEmpty())
			return -1;
		else
			return list.getFirst();
	}
	
	private static int back(){
		if(list.isEmpty())
			return -1;
		else
			return list.getLast();
	}
}
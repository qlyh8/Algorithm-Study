package stage12_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/*
 * [프린터 큐]
 * 여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다. 
 * 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 
 * 하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.
 * 현재 Queue 의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
 * 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue 의 가장 뒤에 재배치 한다.
 * 그렇지 않다면 바로 인쇄를 한다.
 * 예를 들어 Queue 에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.
 * 여러분이 할 일은, 현재 Queue 에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다.
 * 예를 들어 위의 예에서 C 문서는 1번째로, A 문서는 3번째로 인쇄되게 된다.
 *
 * [입력]
 * 첫 줄에 test case 의 수가 주어진다.
 * 각 test case 에 대해서 문서의 수 N(100이하)와
 * 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue 의 어떤 위치에 있는지를 알려주는 M(0이상 N미만)이 주어진다.
 * 다음줄에 N개 문서의 중요도가 주어지는데, 중요도는 적절한 범위의 int 형으로 주어진다.
 * 중요도가 같은 문서가 여러 개 있을 수도 있다. 위의 예는 N=4, M=0(A 문서가 궁금하다면), 중요도는 2 1 4 3이 된다.
 *
 * [출력]
 * 각 test case 에 대해 문서가 몇 번째로 인쇄되는지 출력한다.
 * */
public class Q81_1966 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder builder = new StringBuilder();
		
		for(int n=0 ; n<T ; n++){
			String[] input = reader.readLine().split(" ");
			String[] priority = reader.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			int count = 0;
			queue.clear(); // 큐 비우기
			
			for(int i=0 ; i<N ; i++)
				queue.add(Integer.parseInt(priority[i]));
			
			while(!queue.isEmpty()){
				boolean isPriority = true;
				
				for(int i=1 ; i<queue.size() ; i++){
					if(queue.peek() < queue.get(i)){ // 중요도 체크
						isPriority = false;
						break;
					}
				}
				
				if(isPriority){ // 중요도가 가장 높다면 제거
					count++;
					queue.poll();
					
					if(M == 0)
						break;
					else 
						M -= 1;
				}
				else { // 그렇지 않으면 뒤로 보냄
					int temp = queue.poll();
					queue.add(temp);
					M = (M==0) ? queue.size()-1 : --M;
				}
			}
			builder.append(count).append("\n");
		}
		System.out.println(builder);
	}
}
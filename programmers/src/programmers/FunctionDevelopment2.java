package programmers;

import java.util.*;

public class FunctionDevelopment2 { // Lv.2 스택/큐 - 기능개발

	class Solution {
		public int[] solution(int[] progresses, int[] speeds) {
			List<Integer> answerlist = new ArrayList<>();
			Deque<Integer> que = new ArrayDeque<>();
			for (int i = 0; i < progresses.length; i++) {
				int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
				que.add(days);
			}
			while (!que.isEmpty()) {
				int count = 0;
				int peek = que.peek();
				while (!que.isEmpty() && que.peek() <= peek) {
					que.poll();
					count++;
				}
				answerlist.add(count);
			}
			int[] answer = new int[answerlist.size()];
			for (int i = 0; i < answerlist.size(); i++) {
				answer[i] = answerlist.get(i);
			}
			return answer;
		}
	}
}

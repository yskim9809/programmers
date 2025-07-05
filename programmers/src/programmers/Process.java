package programmers;

import java.util.*;

public class Process { // Lv.2 스택/큐 - 프로세스

	class Solution {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			Deque<Integer> que = new ArrayDeque<>();
			Deque<Integer> que2 = new ArrayDeque<>();
			int count = 0;
			for (int i = 0; i < priorities.length; i++) {
				que.add(priorities[i]);
				que2.add(i);
			}
			while (!que.isEmpty()) {
				int n = que.poll();
				int m = que2.poll();
				boolean check = true;
				boolean loc = false;
				if (m == location) {
					loc = true;
				}
				for (int num : que) {
					if (num > n) {
						que.add(n);
						que2.add(m);
						check = false;
						break;
					}
				}
				if (check == true) {
					count++;
					if (loc == true) {
						answer = count;
						return answer;
					}
				}
			}
			return answer;
		}
	}

}

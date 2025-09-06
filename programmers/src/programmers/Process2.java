package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Process2 {
	class Solution {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			Queue<int[]> que = new LinkedList<>();
			for (int i = 0; i < priorities.length; i++) {
				que.add(new int[] { i, priorities[i] });
			}
			Arrays.sort(priorities);
			for (int j = priorities.length - 1; j >= 0; j--) {
				while (!que.isEmpty()) {
					int[] temp = que.poll();
					int or = temp[0]; // 순서
					int pr = temp[1]; // 우선순위

					if (pr < priorities[j]) { // 그냥j 아니고 priorities[j] 주의하기
						que.add(new int[] { or, pr });
					} else {
						answer++;
						if (or == location) {
							return answer;
						}
						break;
					}

				}
			}
			return answer;
		}
	}

}

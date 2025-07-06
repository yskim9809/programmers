package programmers;

import java.util.*;

public class TruckPassingOverTheBridge { // Lv.2 스택/큐 - 다리를 지나는 트럭

	class Solution {
		public int solution(int bridge_length, int weight, int[] truck_weights) {
			Deque<Integer> que = new ArrayDeque<>();
			for (int i = 0; i < bridge_length; i++) {
				que.add(0);
			}
			int time = 0;
			int weightsum = 0;
			int idx = 0;
			while (!que.isEmpty()) {
				time++;
				weightsum -= que.poll();
				if (idx < truck_weights.length) {
					if (truck_weights[idx] + weightsum <= weight) {
						weightsum += truck_weights[idx];
						que.add(truck_weights[idx]);
						idx++;
					} else {
						que.add(0);
					}
				}

			}
			return time;
		}
	}
}

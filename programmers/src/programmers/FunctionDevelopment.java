package programmers;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment { // Lv.2 기능개발
	class Solution {
		public int[] solution(int[] progresses, int[] speeds) {
			int[] day = new int[progresses.length];

			for (int i = 0; i < progresses.length; i++) {
				day[i] = (100 - progresses[i]) / speeds[i];
				if ((100 - progresses[i]) % speeds[i] != 0) {
					day[i] += 1;
				}
			}
			List<Integer> list = new ArrayList<>();
			int x = day[0];
			int count = 1;
			for (int i = 1; i < day.length; i++) {
				if (x >= day[i]) {
					count++;
				} else {
					list.add(count);
					count = 1;
					x = day[i];
				}
			}
			list.add(count);
			int[] answer = list.stream().mapToInt(t -> t).toArray();
			return answer;
		}
	}

}

package programmers;

import java.util.*;

public class Lifeboat {// Lv.2 구명보트

	class Solution {
		public int solution(int[] people, int limit) {
			int answer = 0;
			int index = 0;
			Arrays.sort(people);
			for (int i = people.length - 1; i >= index; i--) {
				if (people[index] + people[i] <= limit) {
					answer++;
					index++;
				} else {
					answer++;
				}
			}

			return answer;
		}
	}
}

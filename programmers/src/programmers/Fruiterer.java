package programmers;

import java.util.*;

public class Fruiterer { //Lv.1 과일 장수

	class Solution {
		public int solution(int k, int m, int[] score) {
			int answer = 0;
			int[] score2 = new int[score.length];
			Arrays.sort(score);
			int x = 0;
			for (int i = score.length - 1; i >= 0; i--) {
				score2[x] = score[i];
				x++;
			}
			for (int i = 0; i < score2.length; i++) {
				if ((i + 1) % m == 0) {
					answer += score2[i] * m;
				}
			}

			return answer;
			// 1 1 1 2 2 3 3
		}
	}
}

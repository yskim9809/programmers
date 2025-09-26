package programmers;

import java.util.ArrayList;
import java.util.List;

public class MockTest { // 모의고사

	public static void main(String[] args) {
		class Solution {
			public int[] solution(int[] answers) {
				int[] one = { 1, 2, 3, 4, 5 };
				int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
				int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
				int[] lengths = { 0, 0, 0 };
				int[] correct = { 0, 0, 0 };
				for (int i = 0; i < answers.length; i++) {
					if (answers[i] == one[lengths[0]]) {
						correct[0]++;
					}
					lengths[0]++;
					if (lengths[0] == one.length) {
						lengths[0] = 0;
					}
					if (answers[i] == two[lengths[1]]) {
						correct[1]++;
					}
					lengths[1]++;
					if (lengths[1] == two.length) {
						lengths[1] = 0;
					}
					if (answers[i] == three[lengths[2]]) {
						correct[2]++;
					}
					lengths[2]++;
					if (lengths[2] == three.length) {
						lengths[2] = 0;
					}
				}
				List<Integer> list = new ArrayList<>();
				int max = 0;
				for (int i = 0; i < correct.length; i++) {
					if (correct[i] > max) {
						max = correct[i];
					}
				}
				for (int i = 0; i < correct.length; i++) {
					if (correct[i] == max) {
						list.add(i + 1);
					}
				}
				int si = list.size();
				int[] answer = new int[si];
				for (int i = 0; i < si; i++) {
					answer[i] = list.get(i);
				}

				return answer;
			}
		}

	}

}

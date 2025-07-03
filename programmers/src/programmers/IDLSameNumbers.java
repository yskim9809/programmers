package programmers;

import java.util.*;

public class IDLSameNumbers { // Lv.1 스택/큐 - 같은 숫자는 싫어

	public class Solution {
		public int[] solution(int[] arr) {
			Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < arr.length; i++) {
				if (!stack.isEmpty()) {
					if (stack.peek() != arr[i]) {
						stack.push(arr[i]);
					}
				} else {
					stack.push(arr[i]);
				}
			}
			int[] answer = new int[stack.size()];
			for (int i = stack.size() - 1; i >= 0; i--) {
				answer[i] = stack.pop();
			}
			return answer;
		}
	}
}

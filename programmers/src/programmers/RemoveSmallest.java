package programmers;

import java.util.*;

public class RemoveSmallest { // Lv.1 제일 작은 수 제거하기

	class Solution {
		public int[] solution(int[] arr) {
			int[] answer = {};
			int[] copy = new int[arr.length];
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				copy[i] = arr[i];
			}
			Arrays.sort(copy);
			int min = copy[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != min) {
					list.add(arr[i]);
				}
			}
			if (list.size() == 0) {
				list.add(-1);
			}
			answer = list.stream().mapToInt(x -> x).toArray();
			return answer;
		}
	}
}

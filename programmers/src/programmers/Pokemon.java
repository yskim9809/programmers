package programmers;

import java.util.ArrayList;
import java.util.List;

public class Pokemon { // Lv1.해시 - 포켓몬
	class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				if (list.size() >= nums.length / 2) {
					break;
				} else {
					if (list.contains(nums[i])) {
						continue;
					} else {
						list.add(nums[i]);
					}
				}

			}
			answer = list.size();
			return answer;
		}
	}

}

package programmers;

import java.util.HashSet;

public class Pokemon2 { // Lv1.해시 - 포켓몬
	class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			HashSet<Integer> set = new HashSet<>();
			for (int num : nums) {
				set.add(num);
			}
			if (nums.length / 2 > set.size()) {
				answer = set.size();
			} else {
				answer = nums.length / 2;
			}

			return answer;
		}
	}

}

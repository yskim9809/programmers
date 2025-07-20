package programmers;

import java.util.*;

public class TargetNumber {// Lv.2 dfs - 타겟 넘버

	static class Solution {
		static int count = 0;
		static int targett;
		static int[] numberss;

		public int solution(int[] numbers, int target) {
			count = 0;
			numberss = numbers;
			targett = target;
			dfs(0, 0);
			return count;
		}

		static void dfs(int idx, int sum) {
			if (idx == numberss.length) {
				if (sum == targett) {
					count++;
				}
				return;
			}
			dfs(idx + 1, sum + numberss[idx]);
			dfs(idx + 1, sum - numberss[idx]);
		}
	}

}

package programmers;

public class Fibonacci {
	class Solution {
		public int solution(int n) {
			int[] D = new int[n + 1];
			D[0] = 0;
			D[1] = 1;
			for (int i = 2; i <= n; i++) {
				D[i] = (D[i - 1] + D[i - 2]) % 1234567;
				// 모든 단계에서 % 연산을 해 오버플로우 방지
			}

			return D[n];
		}
	}
}

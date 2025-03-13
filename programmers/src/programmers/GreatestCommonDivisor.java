package programmers;

public class GreatestCommonDivisor { // Lv.1 최대공약수와 최소공배수
	class Solution {
		public int[] solution(int n, int m) {
			int[] answer = {};
			int max = 0;
			int min = 0;
			for (int i = 1; i <= n && i <= m; i++) {
				if (n % i == 0 && m % i == 0) {
					max = i; // 최대공약수
				}
			}
			min = (n * m) / max; // 최소공배수
			answer = new int[] { max, min };
			return answer;
		}
	}
}

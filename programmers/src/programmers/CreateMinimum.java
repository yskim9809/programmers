package programmers;

import java.util.*;

public class CreateMinimum { // Lv.2 최솟값 만들기

	class Solution {
		public int solution(int[] A, int[] B) {
			int answer = 0;
			Arrays.sort(A);
			Arrays.sort(B);
			for (int i = 0; i < A.length; i++) {
				answer += A[i] * B[A.length - i - 1];
			}

			return answer;
		}
	}
}

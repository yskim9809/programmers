package programmers;

import java.util.stream.IntStream;

public class SumOfDivisors { // Lv.1 약수의 합
	class Solution {
		public int solution(int n) {
			return IntStream.range(1, n + 1).filter(i -> n % i == 0).sum();
		}
	}
}

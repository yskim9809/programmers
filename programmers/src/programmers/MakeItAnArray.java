package programmers;

public class MakeItAnArray { // Lv.1 자연수 뒤집어 배열로 만들기
	class Solution {
		public int[] solution(long n) {
			String[] arr = Long.toString(n).split("");
			int[] answer = new int[arr.length];
			int x = 0;
			for (int i = arr.length - 1; i >= 0; i--) {
				answer[x] = Integer.parseInt(arr[i]);
				x++;
			}
			return answer;
		}
	}
}

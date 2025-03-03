package programmers;

public class SplitString {

	class Solution { // 연습문제 Lv.1 문자열 나누기
		public int solution(String s) {
			int answer = 0;
			String[] arr = s.split("");
			String x = arr[0];
			int Xcount = 0;
			int Ycount = 0;
			for (int i = 0; i < arr.length; i++) {
				if (x.equals(arr[i])) {
					Xcount++;
				} else {
					Ycount++;
				}
				if (Xcount == Ycount) {
					answer++;
					Xcount = 0;
					Ycount = 0;
					if (i < arr.length - 1) {
						x = arr[i + 1];
					}

				} else {
					if (i == arr.length - 1) {
						answer++;
					}
				}
			}

			return answer;
		}
	}

}

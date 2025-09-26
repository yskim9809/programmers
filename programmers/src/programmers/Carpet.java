package programmers;

import java.util.*;

public class Carpet { // 카펫

	public static void main(String[] args) {
		class Solution {
			public int[] solution(int brown, int yellow) {
				int[] answer = new int[2];

				for (int yh = 1; yh <= Math.sqrt(yellow); yh++) {
					if (yellow % yh == 0) {
						int yw = yellow / yh;
						int bw = yw + 2;
						int bh = yh + 2;
						int calc = bh * bw - yellow;

						if (calc == brown) {
							answer[0] = bw;
							answer[1] = bh;
							return answer;
						}
					}

				}
				return answer;
			}
		}

	}

}

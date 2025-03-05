package programmers;

import java.util.*;

public class GymClothes { //탐욕법 Lv.1 체육복 

	class Solution {
		public int solution(int n, int[] lost, int[] reserve) {
			int answer = 0;
			Arrays.sort(lost);
			Arrays.sort(reserve);
			answer = n - lost.length;
			// 여벌 체육복을 가져왔고 도난단함
			for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if (lost[i] == reserve[j]) {
						answer++;
						lost[i] = -1;
						reserve[j] = -1;
						break;
					}  
				}
			}
			// 체육복을 빌릴수있음
			for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
						answer++;
						lost[i] = -1;
						reserve[j] = -1;
						break;
					}
				}
			}
			return answer;
		}
	}

}

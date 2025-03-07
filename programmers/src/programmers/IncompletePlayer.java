package programmers;

import java.util.*;

public class IncompletePlayer { //Lv.1 완주하지 못한 선수

	class Solution {
		public String solution(String[] participant, String[] completion) {
			Arrays.sort(participant);
			Arrays.sort(completion);

			int i;
			for (i = 0; i < completion.length; i++) {
				if (!participant[i].equals(completion[i])) {
					return participant[i]; //차이를 발견하면 즉시 반환
				}
			}

			return participant[i];
		}
	}
}

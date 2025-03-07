package programmers;

import java.util.*;

public class IncompletePlayer { // Lv.1 완주하지 못한 선수

	class Solution {
		public String solution(String[] participant, String[] completion) {
			Arrays.sort(participant);
			Arrays.sort(completion);

			int i;
			for (i = 0; i < completion.length; i++) {
				if (!participant[i].equals(completion[i])) {
					return participant[i]; // 차이를 발견하면 즉시 반환
				}
			}

			return participant[i];
		}
	}

	class Solution2 { // 해시로 풀기
		public String solution(String[] participant, String[] completion) {
			Map<String, Integer> map = new HashMap<>();
			// 참가자 배열을 순회하며 해시맵에 이름을 저장 (이름별 등장 횟수 카운트)
			for (String p : participant) {
				map.put(p, map.getOrDefault(p, 0) + 1);
				// getOrDefault(p, 0) -> 현재 이름이 맵에 없으면 기본값 0을 사용
				// +1을 더해서 해당 선수의 등장 횟수를 증가시킴
			}
			// 완주자 배열을 순회하며 해시맵에서 등장 횟수를 감소
			for (String c : completion) {
				map.put(c, map.get(c) - 1);
				// 완주한 선수의 등장 횟수를 1 감소시킴
			}
			// 해시맵을 순회하며 값이 0이 아닌 선수를 찾음 (완주하지 못한 선수)
			for (String key : map.keySet()) {
				if (map.get(key) > 0) {
					return key; // 등장 횟수가 남아 있는 사람이 완주하지 못한 선수
				}
			}

			return ""; // 모든 선수가 완주했다면 빈 문자열을 반환 (이론적으로 실행되지 않음)
		}
	}
}

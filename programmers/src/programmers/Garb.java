package programmers;

import java.util.HashMap;

public class Garb { // Lv.2 해시 - 의상
	class Solution {
		public int solution(String[][] clothes) {
			int answer = 1;
			HashMap<String, Integer> map = new HashMap<>();
			for (int i = 0; i < clothes.length; i++) {
				map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
			}
			for (String type : map.keySet()) {
				answer *= map.get(type) + 1;
			}
			return answer - 1;
		}
	}
}

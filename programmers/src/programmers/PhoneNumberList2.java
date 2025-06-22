package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class PhoneNumberList2 { // Lv2.해시 - 전화번호 목록
	class Solution {
		public boolean solution(String[] phone_book) {
			boolean answer = true;
			HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));
			for (String num : phone_book) {
				for (int i = 1; i < num.length(); i++) { // 자기 자신은 빼고 검색
					if (set.contains(num.substring(0, i))) {
						return false;
					}
				}
			}

			return answer;
		}
	}

}

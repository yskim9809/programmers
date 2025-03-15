package programmers;

public class HideNumber { // Lv.1 핸드폰 번호 가리기
	class Solution {
		public String solution(String phone_number) {
			String answer = "";
			int leng = phone_number.length();
			String front = phone_number.substring(0, leng - 4);
			String back = phone_number.substring(leng - 4, leng);
			front = front.replaceAll("[0-9]", "*");
			answer = front + back;
			return answer;
		}
	}
}

package programmers;

public class VowelDictionary { // 모음사전

	public static void main(String[] args) {
		class Solution {
			public int solution(String word) {
				int answer = 0;
				// 5진법 = 각 알파벳을 0,1,2,3,4로 치환
				// 각 자리별 가중치
				int[] weight = { 781, 156, 31, 6, 1 };
				char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
				int n = word.length();
				for (int i = 0; i < n; i++) {
					char a = word.charAt(i);
					for (int j = 0; j < vowels.length; j++) {
						if (a == vowels[j]) { //몇 '번째'인지 구하는거니까 자기자신포함
							answer += j * weight[i] + 1;
							break;
						}
					}
				}
				return answer;
			}
		}

	}

}

package programmers;

import java.util.*;

public class BiggestNumber { //Lv.2 정렬 - 가장 큰 수

	class Solution {
		public String solution(int[] numbers) {
			String answer = "";
			String arr[] = new String[numbers.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.toString(numbers[i]);
			}
			Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
			if (arr[0].equals("0")) {
				return "0";
			}
			for (int i = 0; i < arr.length; i++) {
				answer += arr[i];
			}
			return answer;
		}
	}

}

package programmers;

import java.util.*;

public class CorrectParentheses { // 스택, 큐 Lv.2 올바른 괄호
	class Solution {
		boolean solution(String s) {
			boolean answer = false;
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ('(')) {
					cnt -= 1;
				} else {
					cnt += 1;
				}
				if (cnt >= 1) {
					return false;
				}
			}
			if (cnt == 0) {
				return true;
			}

			return false;
		}
	}

	class Solution2 { // 스택으로 풀기
		boolean solution(String s) {
			boolean answer = true;

			String arr[] = s.split("");
			Stack<String> st = new Stack<>();
			if (arr[0].equals(")"))
				return false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("(")) {
					st.push(arr[i]);
				} else {
					if (st.size() > 0)
						st.pop();
					else
						return false;
				}
			}

			return st.size() == 0 ? true : false;
		}
	}
}

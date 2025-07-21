package programmers;

public class Network {// Lv.3 dfs - 네트워크

	class Solution {

		public int solution(int n, int[][] computers) {
			int count = 0;
			boolean[] visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (!visited[i]) {
					dfs(i, computers, visited);
					count++;
				}
			}
			return count;
		}

		void dfs(int now, int[][] computers, boolean[] visited) {
			visited[now] = true;
			for (int next = 0; next < computers.length; next++) {
				if (computers[now][next] == 1 && !visited[next]) {
					dfs(next, computers, visited);
				}
			}
		}
	}
}

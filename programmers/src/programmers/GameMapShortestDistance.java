package programmers;

import java.util.*;

public class GameMapShortestDistance { // Lv.3 bfs - 게임 맵 최단거리

	class Solution {
		public int solution(int[][] maps) {
			int answer = 0;
			int n = maps.length;
			int m = maps[0].length;
			int[][] visited = new int[n][m]; // 몇번째 방문했는지

			Queue<int[]> que = new LinkedList<>();
			que.add(new int[] { 0, 0 });
			visited[0][0] = 1; // 첫방문

			int[] dx = { 0, 0, 1, -1 };// 행
			int[] dy = { 1, -1, 0, 0 };// 열 오, 왼, 아래, 위

			while (!que.isEmpty()) {
				int[] curr = que.poll();
				int x = curr[0];
				int y = curr[1];

				for (int d = 0; d < 4; d++) {
					int nx = x + dx[d];
					int ny = y + dy[d]; // 네 방향 차례대로 탐색

					if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
						if (maps[nx][ny] == 1 && visited[nx][ny] == 0) {
							visited[nx][ny] = visited[x][y] + 1;
							que.add(new int[] { nx, ny });
						}
					}
				}
			}
			if (visited[n - 1][m - 1] == 0)
				return -1;
			return visited[n - 1][m - 1];
		}
	}
}

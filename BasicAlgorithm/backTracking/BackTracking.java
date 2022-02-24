package backTracking;

public class BackTracking {

	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) {

		// 1 ~ N 까지의 숫자
		int N = 5;
		// 숫자의 자릿수
		int M = 3; 
		
		arr = new int[M];
		visited = new boolean[N+1];
		dfs(N, M, 0);
	}

	public static void dfs(int N, int M, int depth) {

		if(depth == M) {
			for(int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			arr[depth] = i;
			dfs(N, M, depth+1);
			visited[i] = false;
		}
	}

}

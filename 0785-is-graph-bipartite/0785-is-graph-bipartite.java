class Solution {
    static int[] visited;
    public boolean isBipartite(int[][] graph) {
        visited = new int[graph.length];

        for(int i=0; i<graph.length; i++) {
            if ( visited[i] == 0 ) {
                if ( !bfs(graph, i) ) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1;

        while(!q.isEmpty()) {
            int value = q.poll();
            for(int v : graph[value]) {
                if ( visited[v] != 0 ) {
                    if ( visited[v] == visited[value] ) {
                        return false;
                    }
                } else {
                    visited[v] = -visited[value];
                    q.add(v);
                }
            }
        }
        return true;
    }
}
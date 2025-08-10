class Solution {
    boolean[] visited;
    int n;
    int[][] grid;
    public void dfs(int x){  
        visited[x]=true;
        for(int i=0;i<this.n;i++){
            if(grid[x][i]==1 && visited[i]==false){
                dfs(i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        this.grid=isConnected;
        this.n = grid.length;   
        int ans=0;
        this.visited = new boolean[this.n];
        for(int i=0;i<this.n;i++){
            if(this.visited[i]==false ){
                ans++;
                dfs(i);
            }   
        }
        return ans;
    }
}

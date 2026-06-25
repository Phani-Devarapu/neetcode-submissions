class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        int maxArea = 0;

        for(int r=0; r < rows; r++){
            for(int c=0; c< cols; c++){
                if(grid[r][c] ==1){
                    int currentArea =0;
                    Queue<int[]> queue = new LinkedList<>();

                    queue.offer(new int[]{r,c});

                    while(!queue.isEmpty()) {
                        int[] temp = queue.poll();
                        currentArea++;

                     grid[r][c] =0;

                     for(int[] dir : directions){
                        int nr = temp[0]+dir[0];
                        int nc = temp[1]+dir[1];

                        if(nr >=0 && nc >= 0 &&  nr < rows && nc < cols && grid[nr][nc]!=0){
                            queue.offer(new int[]{nr,nc});
                            grid[nr][nc] =0;
                        }
                     }   


                    }
                     maxArea = Math.max(maxArea,currentArea);
                }

               
            }
        }

        return maxArea;
        
    }
}
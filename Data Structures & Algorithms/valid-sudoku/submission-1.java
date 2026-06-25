class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer,Set<Character>> rowMap = new HashMap<>();
        Map<Integer,Set<Character>> colMap = new HashMap<>();
        Map<Integer,Set<Character>> boardMap = new HashMap<>();

        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[0].length;c++){

                if(board[r][c]=='.'){
                    continue;
                }

                int currentBoard = (r/3)*3+c/3;

               rowMap.putIfAbsent(r, new HashSet<>());
               colMap.putIfAbsent(c, new HashSet<>());
               boardMap.putIfAbsent(currentBoard, new HashSet<>());

               if(rowMap.get(r).contains(board[r][c]) ||
                  colMap.get(c).contains(board[r][c]) ||
                  boardMap.get(currentBoard).contains(board[r][c]) ){
                    return false;
                  }

                  rowMap.get(r).add(board[r][c]);
                  colMap.get(c).add(board[r][c]);
                  boardMap.get(currentBoard).add(board[r][c]);
            
            }
        }

        return true;
        
    }
}

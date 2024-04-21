class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] newBoard = new int[board.length][board[0].length];
        
        //지뢰 위치 찾기
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 1){
                    dangerZone(i,j,newBoard);
                }
            }
        }
        
        answer = countZero(newBoard);
        
        return answer;
    }
    
    private void dangerZone(int a, int b, int[][] newBoard){
        //상, 하, 좌, 우, 대각선 이동위치 좌표
       int[] dx = {0,1,-1,0,-1,1,1,-1};
       int[] dy = {1,0,0,-1,-1,1,-1,1};
        
        newBoard[a][b] = 1;
        for(int i = 0 ; i < dx.length ; i++){
            int newX = a + dx[i];
            int newY = b + dy[i];
            
             if (newX >= 0 && newX < newBoard.length 
                 && newY >= 0 && newY < newBoard[0].length) {
                newBoard[newX][newY] = 1;
            }
        }
    }
    
    private int countZero(int[][] newBoard){
        int count = 0;
        
         for(int i=0 ; i< newBoard.length; i++){
            for(int j=0 ; j< newBoard[i].length; j++){
                if(newBoard[i][j]==0){
                        count++;
                 }            
            }
        }
        return count;
    }
}
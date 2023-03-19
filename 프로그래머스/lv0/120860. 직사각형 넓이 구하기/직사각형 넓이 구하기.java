

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        //x값의 길이 = x최댓값 - x최솟값
        //y값의 길이 = y최댓값 - y최솟값
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];
        
        for(int i = 1 ; i < dots.length ; i++){
            minX = Math.min(minX, dots[i][0]);
            maxX = Math.max(maxX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxY = Math.max(maxY, dots[i][1]);
        }
        
        answer = (maxX - minX)*(maxY-minY);
        
        return answer;
    }
}
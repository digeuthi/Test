class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        answer[0] = (long) x ;
        for(int i = 1 ; i < n ; i++){
            answer[i] = (long)x*(i + 1);
        }
        return answer;
    }
}
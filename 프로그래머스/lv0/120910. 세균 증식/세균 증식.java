class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for (int i = 1 ; i <= t ; i ++){ //i는 1부터! (1<= t <=15)
            n *= 2;
        }
        answer = n;
        return answer;
    }
}
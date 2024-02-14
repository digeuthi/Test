class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(numCheck(number,n) == 1 && numCheck(number,m) == 1){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    private int numCheck(int number, int a){
        int result = 0;
        if(number % a ==0){
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
    
    
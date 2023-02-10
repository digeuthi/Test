class Solution {
    public int solution(int n) {
        int answer = 0;
        if (Math.sqrt(n)%1 == 0){ //sqrt = the square root of a value of type double
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
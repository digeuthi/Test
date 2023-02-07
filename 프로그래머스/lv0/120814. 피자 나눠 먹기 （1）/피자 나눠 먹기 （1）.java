class Solution {
    public int solution(int n) {
        int answer = 0;
        //n값을 7로 나눴을때 나머지가 0이면, 피자수는 몫값
        //n값을 7로 나눴을때 나머지가 1이면, 피자수는 몫 + 1값
        if (n % 7 == 0){
            answer = n/7;
        } else {
            answer = n/7 +1;
        }
        return answer;
    }
}
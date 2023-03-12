class Solution {
    public int solution(int n) {
        int answer = n;
        int num = 1;
        while(num <= answer){
            if((num%3==0)|| String.valueOf(num).contains("3")){
                answer++;
            } 
            num++;
        }
        return answer;
    }
}
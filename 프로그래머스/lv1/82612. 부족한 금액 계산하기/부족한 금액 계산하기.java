class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long countPr = 0;
        for(int i = 1 ; i <= count ; i++){
            countPr += price * i ;
        }
        
        answer = countPr;
        
        if(money < countPr){
            answer = countPr - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000){
            answer = (int)(price * 0.8);
        } else if(500000 > price && price >=300000){
            answer = (int)(price * 0.9);
        } else if(300000 > price && price >= 100000){
            answer = (int)(price * 0.95);
        } else {
            answer = price ; //조건 외의 값도 출력하게 해야됨.
        }
        return answer;
    }
}
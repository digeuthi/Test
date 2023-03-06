class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while(true){
            coupon = chicken / 10; //쿠폰의 갯수
            chicken = (chicken%10) + coupon; 
            //10장채워 서비스로 받고 남은 쿠폰 저장 + 10장채운 쿠폰갯수
            answer += coupon;
            if(chicken < 10){
                break;
            }
        }
        return answer;
    }
}
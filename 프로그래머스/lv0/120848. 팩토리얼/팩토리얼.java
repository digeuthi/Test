class Solution {
    public static int factorial(int num){ //팩토리얼 메서드
        if(num==1) return 1;
        return num * factorial(num - 1);
    }
    
    public int solution(int n) {
        int answer = 0;
        for (int i = 10 ; i > 0 ; i --){
            if(n >= factorial(i)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
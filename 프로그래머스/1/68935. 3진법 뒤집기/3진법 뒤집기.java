class Solution {
    public int solution(int n) {
        int answer = 0;
        String nNum = "";
        
        while(n != 0){
            nNum += n % 3 ;
            n = n / 3;
        }
        
        answer = Integer.parseInt(nNum,3);
        return answer;
    }
}
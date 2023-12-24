class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        String ab = strA.concat(strB);
        String ba = strB.concat(strA);
        
        int intAB = Integer.parseInt(ab);
        int intBA = Integer.parseInt(ba);

        if(intAB>intBA){
            answer = intAB;
        } else if(intAB < intBA){
            answer = intBA;
        } else if(intBA == intAB){
            answer = intAB;
        }
        return answer;
    }
}
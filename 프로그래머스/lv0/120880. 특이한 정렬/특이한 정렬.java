import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] cal = new double[numlist.length];
        //Math.abs 절대값구하기
        
        for(int i = 0; i < numlist.length ; i++){
            if(numlist[i]-n < 0){
                cal[i] = (int)Math.abs(numlist[i]-n)+0.5;
                //n을 뺀값이 음수인(n보다 작은 값)경우 +0.5해서
                //내림차순했을때 뒤의 순서에 오도록 해줌.(abs통해서 절대값)
            }else{
                cal[i] = numlist[i]-n;
            }
        }
        
        Arrays.sort(cal); //오름차순 정렬
            
        for(int i = 0 ; i < numlist.length ; i++){
            if(cal[i] % 1 != 0) answer[i] =  n - (int)cal[i];
            else answer[i] = (int)cal[i] + n;
        }
        
        return answer;
    }
}
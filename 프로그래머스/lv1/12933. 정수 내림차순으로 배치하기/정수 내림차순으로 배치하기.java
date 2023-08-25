import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        String ans = "";
        
        for(String a : arr){
            ans += a;
        }
        
        answer = Long.parseLong(ans);
        return answer;
    }
}
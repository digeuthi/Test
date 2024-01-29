import java.util.*;
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] numStr = num_str.split("");
        int[] nums 
            = Arrays.stream(numStr).mapToInt(Integer::parseInt).toArray();
        
        for(int num : nums){
            answer += num;
        }
        
        
        return answer;
    }
}
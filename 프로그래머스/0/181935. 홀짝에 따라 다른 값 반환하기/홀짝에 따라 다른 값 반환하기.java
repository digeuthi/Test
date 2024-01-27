import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> nums = new ArrayList<>();
        
        if(n % 2 ==0){
            for(int i = 2 ; i <= n ; i += 2){
                nums.add(i*i);
            }
        } else {
            for(int i = 1 ; i <= n ; i += 2){
                nums.add(i);
            }
        }
            
        for(int num : nums){
            answer += num;
        }
            
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int a : nums){
            list.add(a);
        }
        
        Set<Integer> set = new HashSet<>(list);
        
        if(set.size() > list.size() / 2){
            return list.size() / 2;
        } else {
            return set.size();
        }
        
    }
}
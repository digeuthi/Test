import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> resultArr = new ArrayList<>();
        for(int num : arr){
            for(int i = 0 ; i < num ; i++){
                resultArr.add(num);
            }
        }
        
        int[] answer = new int[resultArr.size()];
        answer = resultArr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i] % 2 == 0){
                even.add(num_list[i]);
            } else {
                odd.add(num_list[i]);
            }
        }
        
        int evenConcat = concatNum(even);
        int oddConcat = concatNum(odd);
        
        answer = evenConcat + oddConcat;
            
        return answer;
    }
    
    private int concatNum(List<Integer> numbers){
        int concatNum = 0;
        for(int num : numbers){
            concatNum = concatNum * 10 + num;
        }
        return concatNum;
    }
}
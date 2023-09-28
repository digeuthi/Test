import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i + 1 ; j < numbers.length ; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = new int[set.size()];
        
        for(int a  : set){
            arr.add(a);
        }
        
        Collections.sort(arr);
        
        int count = 0;
        for(int b : arr){
            answer[count] = b;
            count++;
        }
        
        return answer;
        
    }
}
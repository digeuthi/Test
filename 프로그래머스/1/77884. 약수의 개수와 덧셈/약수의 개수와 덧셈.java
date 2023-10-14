import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         int count = 0;
//         int idx = 0;
        
//         for(int i = left ; i <= right ; i++){
//             for(int j = 1 ; j <= right ; j++){
//                 if(i % j ==0){
//                     count++;
//                 }
                
//                 if(count % 2 ==0){
//                     arr.add(i);
//                 } else {
//                     arr.add(-i);
//                 }
//             }
//         }
        
//         for (int num : arr) {
//             answer += num;
//         }
        
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}
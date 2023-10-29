import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0,0,0};
        
        for(int i = 0 ; i < answers.length ; i++){
            if(A[i % 5] == answers[i]) count[0]++;
            if(B[i % 8] == answers[i]) count[1]++;
            if(C[i % 10] == answers[i]) count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        List<Integer> ansMax = new ArrayList<>();
        
        for(int i = 0 ; i < count.length ; i++){
            if(max == count[i]){
                ansMax.add(i+1);
            }
        }
        
        int[] answer = new int[ansMax.size()];
        
        for(int i = 0 ; i < ansMax.size() ; i++){
            answer[i] = ansMax.get(i);
        }
        
        
        return answer;
    }
}
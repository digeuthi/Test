import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        List<Integer> num = new ArrayList<>();
        for(int i = 1 ; i <= (n/k) ; i++){
            num.add(k*i);
        }
        answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
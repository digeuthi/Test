import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        List<String> arr = new ArrayList<>();
        for(int i  = 0 ; i < names.length ; i += 5){
            arr.add(names[i]);
        }
        answer = arr.stream().toArray(String[]::new);
        return answer;
    }
}
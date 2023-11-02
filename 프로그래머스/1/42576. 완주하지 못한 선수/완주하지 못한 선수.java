import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> runnerMap = new HashMap<>();
        
        for (String name : participant) {
            runnerMap.put(name, runnerMap.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            runnerMap.put(name, runnerMap.get(name) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : runnerMap.entrySet()) {
            if (entry.getValue() > 0) {
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}
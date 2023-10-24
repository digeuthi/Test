import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < name.length ; i++){
            String nameStr = name[i];
            int year = yearning[i];
            
            map.put(nameStr, year);
        }
        
        for (int i = 0; i < photo.length; i++) {
            for (String item: photo[i]) {
                answer[i] += map.getOrDefault(item, 0);
            }
        }
        
        return answer;
    }
}
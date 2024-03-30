import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer;
        List<String> str = new ArrayList<>();
        String[] arr = my_string.split("\\s+");
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals(" ")){
                continue;
            } else {
                if(!arr[i].isEmpty()){
                    str.add(arr[i]);
                }
            }
        }
        answer = str.stream().toArray(String[]::new);
        return answer;
    }
}
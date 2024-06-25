import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        List<String> notDoneList = new ArrayList<>();
        
        for(int i =0 ; i < todo_list.length ; i++){
            if(!finished[i]){
                notDoneList.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[notDoneList.size()];
        answer = notDoneList.toArray(answer);
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] strArr = my_string.split("");
        List<String> res = new ArrayList<>();
        
        for(int idx : index_list){
            res.add(strArr[idx]);
        }
        
        answer = String.join("",res);
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String n_str) {
        String answer;
        String[] strArr = n_str.split("");
        for(int i = 0 ; i < n_str.length(); i++){
            if(strArr[i].equals("0")){
                strArr[i] = ""; 
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            sb.append(str);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
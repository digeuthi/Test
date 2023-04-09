import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        List<String> arr = new ArrayList();
        
        for(int i = 0 ; i < my_string.length() ; i++ ){
            if(!arr.contains(String.valueOf(my_string.charAt(i)))){
                arr.add(String.valueOf(my_string.charAt(i)));
            }
        }
        return  String.join("",arr);
    }
}
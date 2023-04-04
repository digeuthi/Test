import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        
        String[] strArr = my_string.split("");
        int[] answer = new int[strArr.length];
        
        for(int i = 0 ; i < strArr.length ; i++){
            answer[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        String[] myStrArr = my_string.split("");
        Arrays.sort(myStrArr);
        //String myStr = Arrays.toString(myStrArr);
        
        StringBuilder builder = new StringBuilder();
        for (String strBulid : myStrArr) {
            builder.append(strBulid).append("");
        }
        String str = builder.toString();
        answer = str;
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] changeStr = my_string.split("");
        
        for (int i = 0 ; i < changeStr.length ; i++){
            if(num1 == i){
                answer += changeStr[num2];
            } else if(num2 == i){
                answer += changeStr[num1];
            } else {
                answer += changeStr[i];
            }
        }
        return answer;
    }
}
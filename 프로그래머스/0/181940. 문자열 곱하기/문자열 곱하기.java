class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuilder repeat = new StringBuilder();
        for(int i = 1 ; i <= k ; i ++){
            repeat.append(my_string);
        }
        answer = repeat.toString();
        return answer;
    }
}
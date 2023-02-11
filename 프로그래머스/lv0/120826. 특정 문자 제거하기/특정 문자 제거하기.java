class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String delete = my_string.replaceAll(letter,"");
        answer = delete;
        return answer;
    }
}
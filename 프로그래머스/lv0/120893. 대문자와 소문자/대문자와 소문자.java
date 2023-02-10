class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0 ; i < my_string.length() ; i ++){ //문자열에서는 length() 로 사용
            if (Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toLowerCase(my_string.charAt(i));
            } else if(Character.isLowerCase(my_string.charAt(i))){
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}

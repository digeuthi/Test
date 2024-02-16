class Solution {
    public String solution(String myString) {
        String answer = "";
        //아스키코드 이용
        for(int i = 0 ; i < myString.length() ; i ++){
            int num = 0;
            num = (int)myString.charAt(i);
            if((97 <= num) && (num<=122)){ //소문자인경우
                answer += (char)(num-32);
            } else {
                answer += (char)num;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // for (int i = 0; i < 3; i++){
        //     System.out.print(answer);
        // }
        //문자열 안의 하나하나를 char로 만들어서 반복해야함
        char[] ch = my_string.toCharArray();
        
        for (int i = 0; i< ch.length; i++){
            for (int j = 0 ; j < n; j++){
            answer += ch[i];
            }
        }
        return answer;
    }
}
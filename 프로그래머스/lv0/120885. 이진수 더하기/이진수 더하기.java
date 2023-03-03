class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int binNum1 = Integer.parseInt(bin1,2);
        int binNum2 = Integer.parseInt(bin2,2); //2진수 문자열 10진수 정수로 변환
        int sum = binNum1 + binNum2 ; //10진수 정수
        answer = Integer.toString(sum,2); //10진수 정수를 2진수 문자열로 변환
        return answer;
    }
}
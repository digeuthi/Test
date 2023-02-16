class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // String intStr = my_string.replaceAll("[^0-9]","");
        // Integer num = Integer.valueOf(intStr);
        // answer = num;
        my_string = my_string.replaceAll("[^0-9]",""); //0-9를 제외한 값을 ""으로 바꾸기
        String[] arr = my_string.split(""); //특정 문자를 기준으로 문자열을 나누어 Array로 바꿈
        
        for(int i =0; i < arr.length; i++){
            answer += Integer.valueOf(arr[i]); //Integer.valueOf : 문자열을 숫자로 변환
        }
        
        return answer;
    }
}
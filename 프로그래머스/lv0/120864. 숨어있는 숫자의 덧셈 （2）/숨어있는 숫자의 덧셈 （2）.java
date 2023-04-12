class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("[a-zA-Z]+");
        
        for(int i = 0 ; i < strArr.length ; i++){
            if(!strArr[i].isEmpty()){
                answer += Integer.parseInt(strArr[i]);
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}
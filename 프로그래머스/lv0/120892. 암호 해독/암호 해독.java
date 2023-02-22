class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        //StringBuilder는 변경 가능한 문자열을 만들어 준다.
        StringBuilder sb = new StringBuilder();
        String[] cipherArr = cipher.split("");//cipher을 잘라서 배열로 만들었다.
        for(int i = 0 ; i < cipherArr.length ; i++){
            if((i+1) % code == 0){ //i=0인경우 계산 위함.
                sb.append(cipherArr[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
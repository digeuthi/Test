class Solution {
    public String solution(String myString) {
        String answer = "";
        
        // StringBuilder를 사용하여 문자열을 수정합니다.
        StringBuilder modifiedString = new StringBuilder(myString.length());
        
        // 문자열의 각 문자를 순회합니다.
        for (char ch : myString.toCharArray()) {
            // 현재 문자가 'l'보다 작으면 'l'로 대체합니다.
            if (ch < 'l') {
                modifiedString.append('l');
            } else {
                modifiedString.append(ch);
            }
        }
        
        answer = modifiedString.toString();
        return answer;
    }
   
}
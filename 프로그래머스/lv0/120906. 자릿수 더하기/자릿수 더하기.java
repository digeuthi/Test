class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        
        for (int i = 0 ; i < s.length() ; i++){ //문자열의 길이는 length() 사용!
            answer += Integer.parseInt(s.substring(i,i+1));
        }
      
        return answer;
    }
}
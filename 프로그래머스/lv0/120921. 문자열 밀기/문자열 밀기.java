class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String copy = A;
        
        for(int i = 0 ; i < copy.length() ; i++){
            if(copy.equals(B)){
                return answer;
            }
            String end = copy.substring(copy.length()-1);
            copy = end + copy.substring(0,copy.length()-1);
            answer++;
        }
        
        return -1;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
    
        String tempMyString = myString.replace("A","temp");
        String tempMyString2 = tempMyString.replace("B","A");
        String resultMyString = tempMyString2.replace("temp","B");
        
        if(resultMyString.contains(pat)){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
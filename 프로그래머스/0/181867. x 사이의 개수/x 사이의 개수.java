class Solution {
    public int[] solution(String myString) {
        
        String[] xArr = myString.split("x",-1);
        int[] answer = new int[xArr.length];
        for(int i = 0 ; i < xArr.length ; i++){
            answer[i] = xArr[i].length();
        }
    
        return answer;
    }
}
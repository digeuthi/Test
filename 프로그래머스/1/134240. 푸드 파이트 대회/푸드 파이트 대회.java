class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < food.length ; i++){
            int num = food[i] / 2 ;
            sb.append(String.valueOf(i).repeat(num));
        }
        
        answer = sb + "0";
        answer += sb.reverse();
        return answer;
    }
}
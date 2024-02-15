class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] numStr = rny_string.split("");
        
        for(int i = 0 ; i < numStr.length ; i++){
            if(numStr[i].equals("m")){
                numStr[i] = "rn";
            } else {
                continue;
            }
        }
        
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < numStr.length ; i++){
            str.append(numStr[i]);
        }
        answer = str.toString();
        return answer;
    }
}
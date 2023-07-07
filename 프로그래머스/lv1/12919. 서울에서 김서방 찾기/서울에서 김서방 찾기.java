class Solution {
    public String solution(String[] seoul) {
        
        String answer = "";
        int point = 0;
        for(int i = 0 ; i < seoul.length ; i++){
            if(seoul[i].equals("Kim")){
                point = i ;
                break;
            }
        }
        
        answer = "김서방은 " + point + "에 있다";
        return answer;
    }
}


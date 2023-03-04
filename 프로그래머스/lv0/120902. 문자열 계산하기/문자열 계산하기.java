class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] calNum = my_string.split(" ");
        answer += Integer.parseInt(calNum[0]);
        for(int i = 1 ; i < calNum.length ; i++){
            if(i%2 != 0){
                if(calNum[i].equals("+")){
                    answer += Integer.parseInt(calNum[i+1]);
                } else {
                    answer -= Integer.parseInt(calNum[i+1]);
                }
            }
        }
        return answer;
    }
}
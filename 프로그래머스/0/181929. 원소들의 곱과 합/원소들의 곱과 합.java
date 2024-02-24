class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int addNum = 0;
        int byNum = 1;
        
        for(int i = 0 ; i < num_list.length ; i++){
            addNum += num_list[i];
            byNum *= num_list[i];
        }
        
        if(byNum <= (addNum*addNum)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
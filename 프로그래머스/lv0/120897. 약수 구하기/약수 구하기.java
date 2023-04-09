class Solution {
    public int[] solution(int n) {
        int[] numArr = new int[10000];
        int index = 0;
        
        for(int i = 1 ; i <= n ; i++){
            if(n % i ==0){
                numArr[index] = i;
                index++;
            }
        }
        
        int[] answer = new int[index];
            for(int i = 0 ; i < index ; i++){
                if(numArr[i] != 0){
                    answer[i] = numArr[i];
                }
            }
        return answer;
    }
}
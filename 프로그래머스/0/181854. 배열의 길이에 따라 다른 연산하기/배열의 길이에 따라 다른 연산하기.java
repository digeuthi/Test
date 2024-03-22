class Solution {
    public int[] solution(int[] arr, int n) {
        int arrLen = arr.length;
        int[] answer = new int[arrLen];
        
        if(arrLen % 2 == 0){
            for(int i = 0 ; i < arrLen ; i++){
                if(i % 2 == 0){
                    answer[i] = arr[i];
                } else {
                    answer[i] = arr[i] + n;
                }
            }
        } else {
            for(int i = 0 ; i < arrLen ; i++){
                if(i % 2 == 0){
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int idx = 0;
        for(int i = start ; i >= end_num ; i--){
            answer[idx++] = i;
        }
        return answer;
    }
}
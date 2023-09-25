import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> qScore = new PriorityQueue<>();
        
        for(int i = 0 ; i < score.length ; i++){
            qScore.add(score[i]);
            if(qScore.size() > k){
                qScore.poll();
            }
            answer[i] = qScore.peek(); 
        }
        return answer;
    }
}
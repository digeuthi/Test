class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            
        }
        answer = sum / numbers.length; 
        //최종 sum을 끝낸 후에 배열 수로 나누는게 정확
        return answer;
    }
}
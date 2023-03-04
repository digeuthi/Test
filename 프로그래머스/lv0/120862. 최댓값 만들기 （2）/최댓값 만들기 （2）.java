import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0 ;
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        int max2 = numbers[0] * numbers[1];
        if (max1 > max2) {
            answer = max1;
        } else {
            answer = max2;
        }
        return answer;
    }
}
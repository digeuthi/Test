import java.util.Arrays; //Arrays 함수 쓰려면 사용해야함.
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, (num2 + 1));
        //Arrays.copyOfRange(배열, 시작인덱스, 끝인덱스 + 1))
        return answer;
    }
}
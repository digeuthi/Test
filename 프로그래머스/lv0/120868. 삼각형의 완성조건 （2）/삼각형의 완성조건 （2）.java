import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        //삼각형의 완성 조건 a + b > c
        
        //b가 제일 긴 변일 경우
        for(int i = max - min + 1 ; i <= max ; i++){
            answer++;
        }
        
        //c가 제일 긴 변일 경우
        for(int i = max + 1 ; i < min + max ; i++){
            answer++;
        }
        return answer;
    }
}
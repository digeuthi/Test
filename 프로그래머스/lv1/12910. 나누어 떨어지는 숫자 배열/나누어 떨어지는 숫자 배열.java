import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {}; //배열 크기 미지정
        int count = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % divisor == 0){
                count ++ ;
            }
        }
        
        answer = new int[count]; //배열의 크기 지정
        
        int index = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % divisor == 0){
                answer[index++] += arr[i];
            }
        }
        
        if (count == 0) {
            answer = new int[]{-1};
            return answer;
        }
      
        Arrays.sort(answer);
        return answer;
    }
}
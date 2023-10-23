import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0 ; i < commands.length ; i ++){
            
            int start = commands[i][0];
            int end = commands[i][1];
            
            // 배열의 길이를 올바르게 설정
            int[] arr = new int[end - start + 1];
            
            // 배열 복사를 수행
            System.arraycopy(array, start - 1, arr, 0, end - start + 1);
            
            Arrays.sort(arr);
            
            // k번째 숫자를 구하여 answer 배열에 할당
            answer[i] = arr[commands[i][2] - 1];
            
//             int[] arr = new int[end - start + 1];
//             arr[i] = array.substring(start,end);
            
//             Arrays.sort(arr);
            
//             answer[i] = arr[commands[i][2] - 1];
        }
        
        return answer;
    }
}
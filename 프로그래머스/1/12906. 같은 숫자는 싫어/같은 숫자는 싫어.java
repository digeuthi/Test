import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int value = -1 ; //배열 내에 존재하지 않는 수
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != value){
                arrList.add(arr[i]);
                value = arr[i];
            }
        }
        
        answer = arrList.stream().mapToInt(x->x).toArray();
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
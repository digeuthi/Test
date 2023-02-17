
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // String[] strArr = String.valueOf(array);
        // for(int i = 0 ; i < strArr.length ; i++){
        //     String strArr = array.charAt(i);
        //         if(strArr.equals("7")){
        //             answer ++;
        //         } else {
        //             answer = 0;
        //         }
        //     }
        
        for(int i = 0; i < array.length ; i++){
            String strArr = String.valueOf(array[i]);
            String[] arr = strArr.split(""); //문자열의 배열화
            
            for(int j = 0; j < arr.length ; j++){
                if(arr[j].equals("7")){
                    answer ++;
                }
            }
        }
        return answer;
    }
}
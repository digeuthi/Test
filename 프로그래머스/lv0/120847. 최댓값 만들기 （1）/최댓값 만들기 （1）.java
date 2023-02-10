class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // int max = 0;
        // int max2 = 0;
        // for (int i = 0 ; i < numbers.length ; i++){
        //     if (numbers[i] > max){
        //         max = numbers[i];
        //     } else if(numbers[i] > max2 && numbers[i] != max){
        //         max2 = numbers[i];
        //     }
        // }
        // answer = max * max2 ;
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j <numbers.length; j++){
                if (i != j && numbers[i]*numbers[j] > max){
                    max = numbers[i]*numbers[j];
                }
            }
        }
        answer = max;
        return answer;
    }
}
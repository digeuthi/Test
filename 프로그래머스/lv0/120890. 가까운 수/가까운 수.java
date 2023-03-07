import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0 ; i <array.length ; i++) {
            if(array[i] >= n){
                int rightValue = array[i] - n;
                int leftValue = n - array[(i-1)];
                return leftValue <= rightValue ? array[(i - 1)] : array[i];
            } 
        }
        return array[array.length - 1];
    }
}
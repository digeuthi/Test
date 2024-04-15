import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
       
        if(arr1Len > arr2Len){
            answer = 1;
        } else if(arr1Len < arr2Len){
            answer = -1;
        } else if(arr1Len == arr2Len){
            if(arrSum(arr1) > arrSum(arr2)){
                answer = 1;
            } else if(arrSum(arr1) < arrSum(arr2)){
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
    
    private int arrSum(int[] arr){
        int sumArr = 0;
        for(int a : arr){
            sumArr += a;
        }
        
        return sumArr;
        }
    }
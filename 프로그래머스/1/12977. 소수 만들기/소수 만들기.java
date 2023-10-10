import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> numAdd = new ArrayList<>(); 
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i +1 ; j < nums.length ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    int ad = nums[i] + nums[j] + nums[k] ;
                    numAdd.add(ad);
                }
            }
        }
        
        //Set<Integer> mySet = new HashSet<>(numAdd);
        
        for(Integer num : numAdd){
            if (isPrime(num)) {
                answer += 1;
            }
        }
        return answer;
    }
    
    private boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}


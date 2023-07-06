class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int[] num = new int[Integer.toString(x).length()];
        
        int orgX = x;
        
        for(int i = 0 ; i <= x ; i++){
            while(x > 0){
            num[i] += (x % 10);
            x /= 10;
            }
        }
        
        int sum = 0;
        
        for(int j = 0 ; j < num.length ; j++){
            sum += num[j];
        }
        
        if(orgX % sum == 0 ){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}
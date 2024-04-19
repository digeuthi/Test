class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int mode = findMode(array);
        return mode;
    }
    
    private static int findMode(int[] array){
        int mode = 0;
        int maxCount =0;
        int countOfModes = 0; //최빈값의 수를 count
        
        for(int i = 0 ; i < array.length ; i++){
            int currentNum = array[i];
            int currentCount = 1;
            
            for(int j = i + 1 ; j < array.length ; j++){
                if(currentNum == array[j]){
                    currentCount++;
                }
            }
            if(currentCount > maxCount){
                maxCount = currentCount;
                mode = currentNum;
                countOfModes =1;
            } else if(currentCount == maxCount){
                countOfModes++;
            }
        }
        
        if(countOfModes > 1){
            mode = -1;
        }

        return mode;
    }
}
class Solution {
    public int[] solution(int n, int[] numlist) {
        int j = 0;
        int count = 0;
        for (int i = 0 ; i < numlist.length ; i++){
            if (numlist[i]%n == 0){
                count++ ;
            }
        }
        
        int[] answer = new int[count]; //배열의 길이값 정함
        
        for (int i = 0 ; i < numlist.length ; i++){
            if (numlist[i]%n == 0){
                answer[j] = numlist[i];
                j++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for (int i = 0; i < 26 ; i++){
            arr[i] = 0;
        }
        for (int j = 0; j < s.length() ; j++){
            arr[s.charAt(j) - 97] += 1;
        }
        
        for(int k = 0 ; k < 26 ; k ++){
            if(arr[k] == 1){
                answer += (char)(k + 97);
            }
        }
        return answer;
    }
}
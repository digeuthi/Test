class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0 ; i < n; i++){
            String secret = Integer.toBinaryString(arr1[i] | arr2[i]);
            secret = "0".repeat(n - secret.length()) + secret;
            answer[i] = secret.replaceAll("1", "#").replaceAll("0", " ");
        }
        
        return answer;
    }
}
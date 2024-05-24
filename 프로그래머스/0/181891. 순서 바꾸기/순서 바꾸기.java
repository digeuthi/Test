class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        StringBuilder sb = new StringBuilder();
        for(int i = n  ; i < num_list.length ; i++){
            sb.append(num_list[i]);
        }
        
        for(int j = 0 ; j < n  ; j++){
            sb.append(num_list[j]);
        }
        
        String resultString = sb.toString();
        
        String[] result = resultString.split("");
        for (int i = 0; i < result.length; i++) {
            answer[i] = Integer.parseInt(result[i]);
        }
        return answer;
    }
}
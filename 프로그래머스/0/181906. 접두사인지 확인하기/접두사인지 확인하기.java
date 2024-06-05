class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] preArr = getPre(my_string);
        for (String prefix : preArr) {
            if (prefix.equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
    
    private String[] getPre(String str){
        int n = str.length();
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = str.substring(0, i + 1);
        }

        return result;
    }
}
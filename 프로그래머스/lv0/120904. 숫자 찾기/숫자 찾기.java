class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str1 = Integer.toString(num);
        String str2 = Integer.toString(k);
        if (str1.indexOf(str2)== -1) {
            answer = -1;
        }
        else {
            answer = str1.indexOf(str2) + 1;
        }
        return answer;
    }
}
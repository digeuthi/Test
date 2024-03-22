class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder strAdd = new StringBuilder();
        strAdd.append(a).append(b);
        String str = strAdd.toString();
        int strNum = Integer.parseInt(str);
        if(strNum > 2*a*b){
            answer = strNum;
        } else {
            answer = 2 * a * b;
        }
        return answer;
    }
}
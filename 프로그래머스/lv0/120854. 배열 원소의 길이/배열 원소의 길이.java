class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length(); //strlist배열 i인덱스 문자열의 갯수를 answer의 i인덱스 값으로 
        }
        return answer;
    }
}
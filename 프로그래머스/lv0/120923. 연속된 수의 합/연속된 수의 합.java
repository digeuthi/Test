class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        //등차수열 합의 일반항 = n(n+1)/2
        //start + ( n − 1 ) = total
        int nSum = num * (num +1 ) /2;
        int start = (total - nSum) / num ; //첫항 값
        for(int i = 1 ; i <= num ; i++){
            answer[i - 1] = i + start;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length]; //emergency배열 길이만큼 배열 크기 선언
        for (int i = 0 ; i < emergency.length ; i ++){ //자신보다 큰 값의 응급도가 있으면 자신의 응급도를 +1하는 구조
            for (int j = 0 ; j < emergency.length ; j++ ){
                if(emergency[i] < emergency[j]){
                    answer[i]++ ;
                }
            }
            answer[i]++; //순서를 나타내야하니까 0인 순서가 없도록 i에 +1씩 해주기
        }
        return answer;
    }
}
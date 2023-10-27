import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0 ; i < lost.length ; i++){
            for(int j = 0 ; j < reserve.length ; j++){
                if(lost[i] == reserve[j]){
                    answer ++ ; //수업을 들을수 있는 학생 증가
                    reserve[j] = -1 ; //빌려준 학생은 이제 여벌옷 가진 학생에서 제외
                    lost[i] = -1;
                    break;
                }
            }
        }
        
        for(int i = 0 ; i < lost.length ; i++){
            for(int j = 0 ; j < reserve.length ; j++){
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1){
                    answer ++ ; 
                    reserve[j] = -1 ;
                    break;
                }
            }
        }
        return answer;
    }
}
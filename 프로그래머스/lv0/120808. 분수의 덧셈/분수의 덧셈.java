class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int bunmo = denom1 * denom2;
        int bunja = (denom1 * numer2) + (denom2 * numer1);
        
        for(int i = bunja ; i >1 ; i--){
            if(bunja % i == 0 && bunmo % i == 0) { 
                bunja /= i;
                bunmo /= i;
            }
        }
        int[] answer = {bunja,bunmo};
        return answer;
    }
}
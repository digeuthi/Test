class Solution {
    public int solution(String t, String p) {
        int answer = 0;
//         int pNum = Integer.parseInt(p);
        
//         for(int i = 0 ; i < t.length() - p.length() ; i++){
//             String text = t.substring(i, i + p.length());
            
//             try{
//                 int textNum = Integer.parseInt(text);
//                 if (textNum <= pNum) {
//                     answer++;
//                 }
//             } catch(NumberFormatException e) {
//             }
//         }
        
        int len = p.length();
        Long num = Long.parseLong(p); //str형태를 Long형태로 변환
        
        for(int i = 0 ; i < t.length() - len + 1 ; i++){
            //i < t.length() - len + 1 : 이 글보다 큰 인덱스의 수까지 포함을 시키면
            // 범위 내의 수를 잘라내지 못할 수 있다.
            long subNum = Long.parseLong(t.substring(i,i+len));
            if(subNum <= num){
                answer++ ;
            }
        }
        
    
        return answer;
    }
}
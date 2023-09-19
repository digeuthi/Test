class Solution {
    public String solution(String s) {
//         StringBuilder answer = new StringBuilder();
        
//         for(int i = 0 ; i < s.length() ; i++){
//             char sChar = s.charAt(i);
//             if(sChar == ' '){
//                 answer.append(' ');
//             }else if (i % 2 == 0){
//                 answer.append(Character.toUpperCase(sChar));
//             }else if (i % 2 != 0){
//                 answer.append(Character.toLowerCase(sChar));
//             }
//         } -> 문자열 전체의 짝/홀수 인덱스가 아니라, 
        //       단어(공백을 기준)별로 짝/홀수 인덱스를 판단 이걸 생각안해서 다 정확도 감소
        
        String answer = "";
        String[] sStr = s.split("");
        
        int index = 0;
        for(int i = 0 ; i < sStr.length ; i++){
            if(sStr[i].equals(" ")){
                index = 0; //단어별 인덱스를 판단해야하니까 공백을 만나면 인덱스 초기화
            } else if (index % 2 == 0){
                sStr[i] = sStr[i].toUpperCase();
                index++ ;
            } else if (index % 2 != 0){
                sStr[i] = sStr[i].toLowerCase();
                index++ ;
            }
            
            answer += sStr[i];
        }
        
        return answer;
    }
}
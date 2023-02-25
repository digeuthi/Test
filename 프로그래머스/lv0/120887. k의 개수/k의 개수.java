class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k); //k를 string로 변환
        
        for(int l = i ; l <= j ; l++){
            String lStr = String.valueOf(l); //l을 string으로 변환
            if(lStr.contains(kStr)){
                String[] Array = lStr.split(""); //k를 포함하는 l값을 배열로 만들기
                for(String strArray : Array){
                    if (strArray.equals(kStr)) answer++;
                }
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String dicStr : dic){
            int count = 0;
            for(String spellStr : spell){
                if(dicStr.contains(spellStr)){
                    count ++;
                }
            }
            if(count == spell.length){
                answer = 1;
                break;
            }else{
                answer = 2;
            }
        }
        return answer;
    }
}
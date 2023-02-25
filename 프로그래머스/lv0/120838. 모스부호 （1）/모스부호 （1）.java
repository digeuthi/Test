class Solution {
    public String solution(String letter) {
        String answer = "";
        // String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // answer = letter.charAt(alphabet);
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....",
                              "..",".---","-.-",".-..","--","-.","---",".--.",
                              "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morse;
        morse = letter.split(" ");
        for(String letterM : morse){
            for(int i = 0 ; i < morseList.length ; i++){
                if(letterM.equals(morseList[i])){
                    answer += Character.toString(i + 97);
                }
            }
        }
        return answer;
    }
}
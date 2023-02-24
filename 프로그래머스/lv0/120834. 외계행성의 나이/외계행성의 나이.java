class Solution {
    public String solution(int age) {
        String answer = "";
        //String strAge = String.valueOf(age);
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i = 0 ; i < ageArr.length ; i++){
            //answer += ((char)Integer.parseInt(ageArr[i] + 101));
            answer += age962.charAt(Integer.valueOf(ageArr[i]));
        }
        return answer;
    }
}
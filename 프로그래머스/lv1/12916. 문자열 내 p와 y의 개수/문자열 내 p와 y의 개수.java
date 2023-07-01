class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] count = s.split("");
        int countP = 0;
        int countY = 0;
        for(int i = 0 ; i < count.length ; i++){
            if(count[i].equals("p") || count[i].equals("P")){
                countP += 1;
            } else if (count[i].equals("y") || count[i].equals("Y")){
                countY += 1;
            }
        }
        
        if(countP == countY){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
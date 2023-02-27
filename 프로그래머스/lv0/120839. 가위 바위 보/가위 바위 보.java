import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        // for(String rspStr : rspArr){
        //     if(rspArr.charAt(i) == "2"){
        //         rspStr += "0";
        //     } else if(rspArr.charAt(i) == "0"){
        //         rspStr += "5";
        //     } else {
        //         rspStr += "2";
        //     }
        // }
        // answer = rspStr;
        StringBuilder rspStr = new StringBuilder();
        
        for (int i = 0 ; i < rsp.length() ; i++){
            if(rsp.split("")[i].equals("2")){
                rspStr.append("0");
            } else if (rsp.split("")[i].equals("0")){
                rspStr.append("5");
            }else {
                rspStr.append("2");
            }
        }
        answer = rspStr.toString();
        return answer;
    }
}
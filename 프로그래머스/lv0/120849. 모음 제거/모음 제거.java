class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", ""); //"[a,e,i,o,u]"로하니까 안되던데..?
        // String answer = " ";
        // String[] odd = {"a","e","i","o","u"};
        // for(int i = 0 ; i < odd.length ; i ++){
        //     if(my_string.contains(odd[i])){
        //         answer = my_string.replaceAll(odd[i], "");
        //         my_string = answer ;
        //     } else {
        //         my_string = answer ;
        //     }
        // }
        
        return answer;
    }
}

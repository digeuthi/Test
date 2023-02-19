class Solution {
    public int solution(String s) {
        int answer = 0; 
        String[] arr = s.split(" "); //문자열 배열로 만들기
        int result = 0;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i].equals("Z")){
                result -= Integer.parseInt(arr[i - 1]); //Integer.parseInt 숫자열로 전환
                continue; //끝났다고 탈출하면 안되고 계속 진행되야함.
            }
            result += Integer.parseInt(arr[i]);
        } 
        answer = result;
        return result;
    }
}
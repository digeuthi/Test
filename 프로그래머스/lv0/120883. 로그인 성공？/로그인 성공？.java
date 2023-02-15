class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        // for (int i = 0; i < db.length ; i++){
        //     if (id_pw[0] == db[i][0] && id_pw[1] == db[i][1]){
        //         answer = "login";
        //     } else if(id_pw[0] == db[i][0] && id_pw[1] != db[i][1]){
        //         answer = "wrong pw";
        //     } else {
        //         answer = "fail";
        //     }
        // } ==은 비교 두 대상의 좌표를 비교, equals 는 비교 두 대상의 값 자체를 비교
        for (int i = 0; i< db.length ; i++){
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){ //db[i][0] 아이디비교 db[i][1] 비번비교
                answer = "login";
                break;
            } else if (id_pw[0].equals(db[i][0]) && id_pw[1] != db[i][1]){
                answer = "wrong pw";
                break;
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}

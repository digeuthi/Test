class Solution {
    public int solution(int angle) {
        int answer = 0;
    // switch(angle){
    //     case 1 : 0 < angle < 90;
    //         answer = 1;
    //             break;
    //     case 2 : angle = 90;
    //         answer = 2;
    //         break;
    //     case 3 : 90 < angle < 180;
    //         answer = 3;
    //         break;
    //     case 4 : angle = 180;
    //         answer = 4;
    //         break;
    if (0 < angle && angle <90){
        answer = 1;
    } else if (angle == 90){
        answer = 2;
    } else if (90 < angle && angle < 180){
        answer = 3;
    } else{
        answer = 4;
    }
        return answer;
    }
}
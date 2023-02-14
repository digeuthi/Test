class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int garo = 0;
        int sero = 0;
        int height = 0;
        garo = box[0] / n;
        sero = box[1] / n;
        height = box[2] / n;
        answer = garo * sero * height;
        return answer;
    }
}
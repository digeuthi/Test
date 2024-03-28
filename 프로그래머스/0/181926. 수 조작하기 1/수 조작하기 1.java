class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(char direction : control.toCharArray()){
            switch (direction) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    // 처리하지 않은 다른 문자에 대한 처리
                    break;
            }
        }
        return n;
    }
}
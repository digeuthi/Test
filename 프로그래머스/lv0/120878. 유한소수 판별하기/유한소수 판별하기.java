class Solution {
    public int solution(int a, int b) {
        int bunmo = b / GCD(a,b);
        while(bunmo != 1){
             if (bunmo % 2 == 0) {
                bunmo /= 2;
            } else if (bunmo % 5 == 0) {
                bunmo /= 5;
            } else {
                return 2;
            }
        }
      return 1;      
    }
    
    private int GCD(int a, int b){ //최대공약수 구하기 위함.
        if(a%b==0){
            return b;
        } return GCD(b,a%b);
    }
}
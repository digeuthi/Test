class Solution {
    public int solution(int[][] sizes) {
        //카드지갑의 가로 세로 길이는 명함의 가로 세로 길이보다같거나 크면된다
        int walletMax = 0;
        int walletMin = 0;
        
        for(int[] size : sizes){
            int cardMax = Math.max(size[0],size[1]);
            int cardMin = Math.min(size[0],size[1]);
            
            walletMax = Math.max(walletMax, cardMax);
            walletMin = Math.max(walletMin, cardMin);
        }
        
        return walletMax * walletMin;
    }
}
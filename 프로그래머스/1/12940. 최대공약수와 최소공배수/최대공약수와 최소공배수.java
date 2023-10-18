import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // int max = gcd(n,m);
        // int min = lcm(n,m);
        // answer[0] = (max);
        // answer[1] = (min);
        int max = 0;
        
        for(int i =1 ; i <= n && i <= m ; i++){
            
            if(n % i == 0 && m % i == 0){
                max = i;
            }
        }
        
        int min = (n * m) / max;
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    
    }
    
//     int gcd(int a, int b){
//         //유클리드 호제법 조건
//         if(b < a){ //b를 더 큰수라고 지정.
//             int temp = b;
//             b = b % a;
//             a = temp;
//         }
//         //유클리드 호제법
//         while(b > 0){
//             int r = a % b;
//             a = b;
//             b = r;
//         }
//         return a;
//     }
    
//     int lcm(int a, int b){
//         return a * b / gcd(a,b);
//     }
}


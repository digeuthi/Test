import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long A = in.nextInt();
        long B = in.nextInt();
        System.out.print(cals(A, B));
    }
    
    private static long cals(long a, long b){
        long result = (a + b) * (a - b);
        return result;
    }
}
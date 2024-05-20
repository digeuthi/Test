import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.print(cals(A, B));
    }
    
    private static int cals(int a, int b){
        int result = (a + b) * (a - b);
        return result;
    }
}
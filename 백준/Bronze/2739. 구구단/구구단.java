import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 1 ; i < 10 ; i++){
            int answer = num * i ;
            System.out.println(num + " * " + i + " = " + answer);
        }
    }
}
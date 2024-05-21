import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String numStr = in.nextLine();
        String[] numbers = numStr.split(" ");
        int result = 0;
        for(int i = 0 ; i < 5 ; i++){
            int num = Integer.parseInt(numbers[i]);
            result += (num * num);
        }
        
        System.out.print(result % 10);
        
        in.close();
    }
}
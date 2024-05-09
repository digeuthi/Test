import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int xDot = sc.nextInt();
        int yDot = sc.nextInt();
        
        int place = 0;
        
        if(xDot > 0 && yDot > 0){
            place = 1;
        } else if(xDot < 0 && yDot > 0){
            place = 2;
        } else if(xDot < 0 && yDot < 0){
            place = 3;
        } else if(xDot > 0 && yDot < 0){
            place = 4;
        }
        
        System.out.print(place);
    }
}
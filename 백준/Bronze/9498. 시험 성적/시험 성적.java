import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        String answer;
        
         if(score >= 90){
            answer = "A";
        } else if(90 > score && score >= 80){
            answer = "B";
        } else if(80 > score && score >= 70){
            answer = "C";
        } else if(70 > score && score >= 60){
            answer = "D";
        } else {
            answer = "F";
        }
        
        System.out.print(answer);
    }
}
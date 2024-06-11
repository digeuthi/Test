import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        
        char asciiChar = (char) input.charAt(0);
        int ascii = (int) asciiChar;
        
        System.out.print(ascii);
    }
}
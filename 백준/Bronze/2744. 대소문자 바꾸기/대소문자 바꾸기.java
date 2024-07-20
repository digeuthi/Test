import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length ; i++){
            
            if(Character.isLowerCase(charArr[i])){
                charArr[i] = Character.toUpperCase(charArr[i]);
            } else {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
        }
        
        String answer = new String(charArr);

        System.out.print(answer);
    }
}

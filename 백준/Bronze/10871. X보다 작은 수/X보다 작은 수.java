import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String cond = in.nextLine();
        int[] condArr = convertStrToInt(cond);
        
        String nums = in.nextLine();
        int[] numArr = convertStrToInt(nums);
        
        int condValue = condArr[1];  // condArr의 두 번째 값
        
        for (int num : numArr) {
            if (num < condValue) {
                System.out.print(num + " ");
            }
        }
    }
    
    public static int[] convertStrToInt(String input) {
        String[] strArr = input.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}
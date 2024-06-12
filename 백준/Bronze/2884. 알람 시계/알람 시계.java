import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String hourStr = in.nextLine();
        String newHour = makeHour(hourStr);
        System.out.println(newHour);
    }
    
    public static String makeHour(String hourStr){
        String[] hoursArr = hourStr.split(" ");
        
        int hours = Integer.parseInt(hoursArr[0]);
        int minutes = Integer.parseInt(hoursArr[1]);
        
        minutes -= 45;
        
        if(minutes < 0){
            minutes += 60;
            hours -= 1;
        }
        
        if (hours < 0) {
            hours += 24;
        }
        
        return String.format("%d %d", hours, minutes);

    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] submitted = new int[28];
        
        for (int i = 0; i < 28; i++) {
            submitted[i] = in.nextInt();
        }

        for (int i = 1; i <= 30; i++) {
            boolean found = false;
            for (int j = 0; j < 28; j++) {
                if (submitted[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(i);
            }
        }

        in.close();
    }
}

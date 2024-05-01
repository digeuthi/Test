import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        String B = sc.nextLine().trim(); // 문자열 양 끝의 공백 제거

        String[] bSpil = B.split("");

        for (int i = bSpil.length - 1; i >= 0; i--) {
            System.out.println(A * (Integer.parseInt(bSpil[i])));
        }
        System.out.println(A * (Integer.parseInt(B)));
    }
}

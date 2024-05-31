import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 첫 번째 줄: 정수의 개수 N 입력
        int num = in.nextInt();
        in.nextLine(); // 버퍼 비우기

        // 두 번째 줄: 공백으로 구분된 N개의 정수를 문자열로 입력받기
        String numbers = in.nextLine();

        // 문자열을 공백 기준으로 나누고 int 배열로 변환
        String[] numberStrings = numbers.split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(numberStrings[i]);
        }

        // 세 번째 줄: 찾으려는 정수 v 입력
        int v = in.nextInt();

        // 정수 v가 배열에 몇 번 등장하는지 세기
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}

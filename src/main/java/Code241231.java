import java.util.Scanner;

public class Code241231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for (; number > 0; ) { // 조건을 수정하여 number가 0보다 클 동안 반복
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);

    }
}


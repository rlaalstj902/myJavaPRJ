import java.util.Scanner;
public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("숫자 입력 ==> ");
        int num = s.nextInt();

        if (num%15 == 0 ) {
            System.out.println(" 3의 배수, 5의 배수 모두 만족합니다. ");

        } else if(num%5 == 0) {
            System.out.println(" 5의 배수입니다. ");

        } else if (num%3 == 0) {
            System.out.println(" 3의 배수입니다. ");

        }else {
            System.out.println(" 해당 없습니다. ");
        }
        s.close();
    }
}

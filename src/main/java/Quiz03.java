import java.util.Scanner;
public class Quiz03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("숫자 입력 : ");
        num = s.nextInt();

        if (num%21 == 0) {
            System.out.println("3과 7의 배수입니다. ");

        }else if (num%3 == 0) {
            System.out.println("3의 배수입니다. ");

        } else if(num%7 ==0 ) {
            System.out.println("7의 배수입니다. ");

        }else {
            System.out.println("3과 7의 배수 모두 만족하지 않습니다. ");
        }
    }
}
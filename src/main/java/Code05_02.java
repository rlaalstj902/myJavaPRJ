import java.util.Scanner;
public class Code05_02 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a ;
     a = s.nextInt();


        if ( a < 100) {
            System.out.print("100보다 ");
            System.out.println("작습니다.");
        }

       System.out.println("난 조건절과 상관없이 무조건 실행된다");
    }
}

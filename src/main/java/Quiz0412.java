import java.util.Scanner;
public class Quiz0412 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0 ;

        System.out.print("첫번째 : ");
        int a =s.nextInt();
        System.out.print("두번째 : ");
        int b = s.nextInt();

        for(int i = a; i <= b; i++) {
            if (i%2 != 0 ) {
                hap += i;

            }
        }
        System.out.println(a + "부터" + b + "까지의 홀수의 합 :" + hap);
    }
}

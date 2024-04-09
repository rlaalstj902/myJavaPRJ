import java.util.Scanner;
public class Quiz0409_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 : ");
        int a = s.nextInt();
        System.out.print("두 번째 : ");
        int b = s.nextInt();

        if (a > b) {
            for (int i = a; i > b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i < b; i++) {

                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

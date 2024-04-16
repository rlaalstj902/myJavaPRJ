import java.util.Scanner; // 스캐너 호출
public class Quiz0412{ // 클래스 호출
    public static void main(String[] args) { // 메인함수 생성
        Scanner s = new Scanner(System.in); // 값을 입력받는 스캐너 생성
        int hap = 0; // hap의 초기값을 0으로 설정

        System.out.print("첫 번째 : "); // 화면에 문구 출력
        int a = s.nextInt(); // 정수값을 a애 입력
        System.out.print("두 번쨰 : "); // 화면에 문구 출력
        int b = s.nextInt(); // 정수값을 b에 입력

        for (int i = a; i <=b; i++) { // a부터 b까지 1씩 증가
           if (i%2 != 0) // 2로 나누었을 때 나누어 떨어지지 않는경우 홀수 취급
               hap += i; // 합에 홀수인 i를 더함
        }
        System.out.println(a + " 부터 " + b + "까지 홀수의 합 : " + hap); // 결과 출력
    }
}
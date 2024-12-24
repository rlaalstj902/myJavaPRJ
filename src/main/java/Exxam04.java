import java.util.Scanner; // 스캐너 호출
public class Exxam04 { // 클래스 생성
    public static void main(String[] args) { // 메인함수 생성
        Scanner s = new Scanner(System.in); // 값을 입력받는 스캐너 생성
        int hap = 0; // hap의 초기값을 0으로 설정

        System.out.print("첫번째: "); // 화면에 출력
        int a=s.nextInt(); // 정수값을 a에 대입
        System.out.print("두번째: "); // 화면에 출력
        int b=s.nextInt(); // 정수값을 b에 대입

        if ( a > b ) { // 만약 a가 b보다 크다면
            for (int i=a; i >=b; i--) { // 정수값을 입력받는 i는 a부터 b까지 1씩 감소
                if (i%2 !=0) { // i가 2로 나누어 떨어지지 않을 경우
                    hap +=i ; // 홀수 i를 더해줌
                }
            }
        } else if (a < b ) { // a가 b보다 작다면
            for (int i=a; i <=b; i++) { // i는 a부터 b까지 1씩 증가
                if(i%2 !=0) { // i가 2로 나누어 떨어지지 않는 경우
                    hap +=i ; // hap에 홀수 i를 더해줌
                }
            }
        }
        System.out.println(a  + "부터" + b + "까지 홀수의 합: " +hap); // 화면에 출력
    }
}

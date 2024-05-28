public class Quiz0521 { //클래스명 생성
    public static void main(String[] args) { //메인 함수 생성
        int j =1; // 정수형 변수 j를 1로 초기화
        for (int i=2; j<10; i++) { // 정수형 변수 i는 증감식을 통해 2부터 1씩 증가, j는 10 미만인 9까지의 값을 줌

            System.out.printf("%d X %d =%2d " , i,j,i*j);
            // 구구단 출력 %2d 사용해서 두자리 수로 출력할 수 있도록 함
            if (i==9) { // i가 9가 되면
                j++; // j 값이 증가
                i=1; // j는 i변수가 2-9가지 실행해야 j가 1씩 증가하므로 for문을 두번 실행하는 것처럼 함
                System.out.println();// 줄바꿈

            }
        }
    }
}

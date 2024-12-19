package section01.array;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
        점수의 합계와 평균 구하기
        1. 길이가 5인 정수형 배열을 만든다.
        2. Scanner 를 이용하여 학생 5명의 java 시험 점수를 입력받아, 만든 배열에 저장한다.
        3. 배열에 저장한 점수의 합계(int)와 평균(double)을 구하여 출력한다.
         */

        int[] scores = new int[5];
        // 5개 길이의 정수형 배열 생성

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            // i 가 5(scores.length 배열이 5개) 보다 작을 때 실행
            System.out.print((i + 1) + "번째 학생의 java 점수를 입력해 주세요 : ");
            // 입력된 값을 정수로 받아야 함
            // 현재 i 의 값은 1 다음 루프 때 2, 3, 4, 5 까지 실행
            scores[i] = sc.nextInt();
            // 학생의 점수 값을 scores[i] 변수에 저장
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            // 위에 초기, 조건, 증감 대신 향상된 for 문을 사용할 수 있다.
            sum += scores[i];
            // 학생의 점수 값이 sum 에 누적된다. 총 다섯 번 실행 하기에 n+n+n+n+n 의 누적된 값이 나온다
        }
        /*
        향상된 for 문
        for(int i : scores) {
            sum += i;
        }
        scores(배열값)의 index 순서로 한 번씩 i 에 대입을 해주면서 값을 출력
         */

        double avg = (double) sum / scores.length;
        // 누적된 sum 의 값을 score.length 로 나눈 값을 avg 변수에 저장, 평균은 실수도 나오기에 double 사용
        // scores.length 로 나누는 이유는 평균을 구하기 위해,
        // 학생의 점수가 담겨 있는 5개의 배열이 있기에 평균을 계산할 때 사용

        System.out.println("합계 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

    }
}

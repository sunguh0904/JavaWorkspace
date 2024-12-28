package section02.looping;

import java.util.Scanner;

public class A_nestedFor {
        /*
    중첩 for 문
    for 문 안에서 for 문을 이용할 수 있다.
    첫 for 문에서 조건식을 실행하고
    다음 두 번째 for 문에서 조건식을 실행하는데 false 가 나올 경우 첫 번째 for 문의 증감식으로 넘어간다.
     */

    public void printGugudanFrowTwoTonNine() {
        for (int dan = 2; dan <= 9; dan++){
            // 2라는 값을 dan 변수에 저장하고; dan(2)은 9보다 작거나 같은가; true 면 아래 식 실행
            for (int su = 1; su <= 9; su++) {
                // 1이라는 값을 su 변수에 저장하고; su(1)는 9보다 작거나 같은가; true 면 다음 su++ 증감
                // 식을 실행하고 su가 9보다 클 때 까지 반복
                System.out.println(dan + "*" + su + "=" + (dan * su));
            }
            System.out.println();
        }
    }

    public void printStarInputRowTimes() {
        /*
        키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*" 을 5개씩 출력해보기
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            printStar(2);
            System.out.println();
        }
    }

    public void printStar(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print("*");
        }
    }
}

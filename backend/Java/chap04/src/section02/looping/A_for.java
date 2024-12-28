package section02.looping;

import java.util.Scanner;

public class A_for {
        /*
    [ for 문 표현식 ]
    for(초기식; 조건식; 증감식) {
        조건을 만족하는 경우 수행할 구문(반복할 구문);
    }
     */

    public void simpleForStatement() {
        /* 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문 */
        for(int i = 1; i <= 10; i++) {
            // i 에 1을 변수로 지정 (초기식)
            // i 는 10보다 작거나 같나? true 면 출력 실행
            System.out.println(i);
            // i 는 1이 되었고 증감식 계산을 함
            // 2가 된 i는 다시 조건식과 출력 증감을 반복하면서 조건을 충족하지 못 할 11이 나올 때 까지 반복
        }
    }

    public void testForExample() {

        Scanner sc = new Scanner(System.in);
        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");

        for(int i = 1; i <= 0; i++) {
            System.out.print("먹고 싶은 메뉴를 입력하세요");
            String menu = sc.nextLine();
            System.out.println(menu + "를" + i + "순위로 먹고 싶습니다!");
        }
        System.out.println("먹고 싶은 메뉴가 없습니다.");
    }

    public void testExample2() {

        int sum2 = 0;

        for (int i = 1; i <= 8; i++) {
            sum2 += i; //
        }
        System.out.println("sum2 : " + sum2);
    }

    public void testForExample3() {
        int random = (int)(Math.random() * 6) +5 ;
        System.out.println("random : " + random);

        int sum = 0;
        if (random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if (random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if (random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if (random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if (random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }
        System.out.println("1부터 " + random + "까지의 합은 : " + sum);

        int sum2 = 0;
        for (int i = 1; i <= random; i++) {
            sum2 += i;
        }
        System.out.println("1부터" + random + "까지의 합은 : " + sum2);
    }

    public void testForExample4() {
        /*
        [ 두 수의 합 ]
        1. Scanner 를 이용하여 두 개의 정수를 입력 받는다.
        (단, 두 순자는 같은 숫자를 입력하지 않는다는 가정으로 진행
        2. 입력된 두 수 중, 작은 수부터 큰 수까지의 합계를 구한다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int firstNum = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();

        int sum = 0;

        /* firstNum 이 더 큰 경우 */
        if (firstNum > secondNum) {
            for (int i = secondNum; i <= firstNum; i++) {
                sum += i;
            }
        } else {
            for (int i = firstNum; i <= secondNum; i++) {
                sum += i;
            }
        }
        System.out.println("sum : " + sum);

        int sum2 = 0;

        int min = Math.min(firstNum, secondNum);
        int max = Math.max(firstNum,secondNum);

        for (int i = max; i >= min; i--) {
            sum2 += i;
        }
        System.out.println("sum2 : " + sum2);
    }
}

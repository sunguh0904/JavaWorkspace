package section03.branching;

public class B_continue {
    public void simpleContinueStatement() {
        /*
        continue 문은 반복문 내에서 사용한다.
        해당 반복문의 반복 회차를 멈추고 다시 증감식으로 넘어가게 해준다
        일반적으로 if(조건식) {continue;} 처럼 사용된다.
        보통 특정 조건에 대한 예외를 처리하고자 할 때 사용된다.
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }

    /*
    구구단 출력
    단, 각 단의 수가 짝수인 경우 출력 생략
     */
    public void simpleContinueStatement2() {
        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue;
                    // su 가 짝수면 continue 를 통해 짝수인 값은 출력하지 않는다.
                    // 가장 근접한 for(반복)문을 실행하지 않는다.
                    //
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }System.out.println();
        }
    }

    public void testJumpContinue() {
        label1:
        for (int dan = 2; dan < 10; dan++) {
            System.out.println("=========" + dan + "단==========");

            label2:
            for (int su = 1; su < 10; su++) {
                if(su % 2 == 0) {
                    continue label1;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
}

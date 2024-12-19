package section03.branching;

public class A_break {
        /*
    break 문은 반복문 내에서 사용한다.
    반복문의 조건문 판단 결과와 상관없이 빠져나올 때 사용한다.
    일반적으로 if(조건식) { break; } 처럼 사용된다.
    단, switch 문은 반복문이 아니지만 예외적으로 사용된다
     */

    // 반복문의 break
    public void simpleBreakStatement() {
        int sum = 0;
        int i = 1;
        while(true) {
            sum += i;
            // 누적 문
            if(i == 100) {
                break;
                // i 가 100이 됐을 때 반복문을 멈추겠다
            }
            i++;
        }
        System.out.println("1부터 100가지의 합 : " + sum);
    }

    /* break 는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문을 종료한다. */
    // 중첩 반복문의 break
    public void simpleBreakStatement2() {
        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if (su > 5) {
                    break;
                }
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println();
        }
    }

    public void testJumpBreak() {
        label:
        // break 에 이름을 붙인 곳
        for (;;) {
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                if (i == 3) {
                    break label;
                    // break 에 이름을 붙여줘서 이름을 붙여준 곳에 반복되지 않게 한다
                }
            }
        }
    }
}

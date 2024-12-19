package section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /* 상수란?
        변수가 메모리에 변경될 값을 저장하기 위한 공간을 나태난대면, 상수는 이와 상반되는 개념이다.
        변하지 않는 값을( 항상 고정된 값을 ) 저장해두기 위한 메모리상의 공간을 상수라고 한다.

        상수의 사용 목적
        변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못 하도록 한다.

        사용방법
        1. 상수를 선언한다.( 변수 선언과 유사하지 final 키워드를 사용한다. )
        2. 값을 초기화 한다.( 초기화 이후에는 값 변경 불가능 )
        3. 필요한 위치에 상수를 호출해서 사용한다.
        4. 상수는 절대 값
        */

        // 변수를 지정할 때 앞에 final을 붙히면 상수를 선언한다.
        final int AGE;

        // 한 번 초기화 이후 값을 재 대입하는 것은 불가능하다.
        // AGE = 30;
        AGE = 20;

        System.out.println("AGE의 값 : " + AGE);
        System.out.println("AGE의 2배 : " + ( AGE * 2 ));

        // 대입 연산자의 오른쪽은 가능하나 왼쪽에는 불가능
        // int AGE = AGE + 10;
        int sum = AGE;
    }
}

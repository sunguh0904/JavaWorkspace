package section01.method;

public class Application6 {
    public static void main(String[] args) {
        /* 메소드는 항상 마지막에 return 명령어가 존재한다.
        return 은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        복귀를 할 때 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        이 때 가지고 가는 값을 리턴 값이라고 한다.

        return 값을 반환하기 위해서는 메소드 선언부에 리턴타입을 명시해 주어야 한다.
        void 는 아무 변환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다.
        변환값이 없는 경우 return 구문을 생략해도 되지만,
        변환값이 있는 경우 return 구문을 반드시 작성해야 한다.
        또한 메소드 선언부에 선언학 리턴타입 변환값의 자료형은 반드시 일치해야 한다.
        또한
         */
        System.out.println("main() 시작");

        Application6 app6 = new Application6();
        app6.testMethod(); // 출력하는 명령어가 존재하지 않기 때문에 hello world가 출력되지 않음

        String returnText = app6.testMethod();
        System.out.println(returnText); // hello world 출력함

        System.out.println("main() 종료");
    }

    public String testMethod() {
        /* public 뒤에 바로 return 으로 가지고 갈 타입을 명시한다.
        아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우에는 반환값의 자료형을 작성해야 한다.
         */
        return "hello World";
    }
}

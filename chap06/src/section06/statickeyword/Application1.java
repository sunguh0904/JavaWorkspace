package section06.statickeyword;

public class Application1 {
    public static void main(String[] args) {
                /*
        [ static ]
        정적 메모리 영역에 프로그램이 시작될 때 할당을 하는 키워드
        인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정 가능
        여러 인스턴스가 공유해서 사용할 목적의 공간
        하지만 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식
        명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제
        의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때
         */

        /*
        static 은 객체를 새로 만들었지만 기존 sft1 에 값 1 을 증가시켜 저장되어 다른 객체를 생성하더라도
        나오는 값은 초기화가 되지 않고 1로 출력된다
        static 은 값을 공유한다
         */

        StaticFieldTest sft1 = new StaticFieldTest();   // 0

        System.out.println(sft1.getNonStaticCount());   // 0
        System.out.println(sft1.getStaticCount());

        System.out.println("=============================");

        // 필드의 값 1씩 증가
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());   // 1
        System.out.println(sft1.getStaticCount());      // 1

        System.out.println("=============================");

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println(sft2.getNonStaticCount());   // 0
        System.out.println(sft2.getStaticCount());      // 1

        System.out.println("=============================");

        // non-static 메소드 호출
        StaticMethodTest smt1 = new StaticMethodTest();

        smt1.nonStaticMethod();

        // static 메소드 호출
        // static 은 만들 당시 객체를 만들지 않고 호출하려고 만든 것이다
        // smt1.StaticMethod();
        StaticMethodTest.staticMethod();
    }
}

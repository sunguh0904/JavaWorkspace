package section01.generics;

public class Application {
    public static void main(String[] args) {
        /* [ 제네릭(Generic) ]
        제네릭의 사전적 의미는 '일반적인' 이다.
        자바에서 제네릭이란 데이터의  타입을 일반화 한다는 의미를 가진다.
        제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법이다.
        컴파일 시에 미리 타입 검사를 시행하므로 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있다
        (잘못된 타입일 경우 컴파일 에러를 발생시키기 때문)
        따라서 반환 값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.

        [ 제네릭 프로그래밍 ]
        데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입을 가질 수 있는 기술에 중점을 두어
        재사용성을 높일 수 있는 프로그래밍 방식 */

        GenericTest<Integer> genericTest = new GenericTest<Integer>();
        // Generic 클래스가 모든 Integer 타입으로 바뀐다.

        genericTest.setValue(10);
        System.out.println(genericTest.getValue());
        System.out.println(genericTest.getValue() instanceof Integer);
        // instanceof 객체와 타입의 비교

        GenericTest<String> genericTest1 = new GenericTest<String>();
        genericTest1.setValue("Generic");
        System.out.println(genericTest1.getValue());
        System.out.println(genericTest1.getValue() instanceof String);

        GenericTest<Double> genericTest2 = new GenericTest<Double>();
        genericTest2.setValue(12.3);
        System.out.println(genericTest2.getValue());
        System.out.println(genericTest2.getValue() instanceof Double);
    }
}

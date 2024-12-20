package section03.interfaceimplements;

public interface InterProduct {
        /*
    인터페이스는 상수 필드만 작성 가능하다
    public static final 제어자 조합을 상수 필드라고 부른다
    반드시 선언과 동시에 초기화 해줘야 한다
     */

    public static final int MAX_NUM = 100;
    int MIN_NUM = 10;
    // public static final 생략 되어 있다

    // 에러
    // 인터페이스는 생성자를 가질 수 없다.
    // public InterProduct() {}

    // 에러
    // 구현부가 있는 non-static 메소드를 가질 수 없다.
    // public void nonStaticMethod(){}

    // 추상 메소드만 작성 가능
    public abstract void nonStaticMethod();

    // 인터페이스의 메소드는 묵시적으로 public abstract 의 의미를 가지기 때문에
    // 인터페이스의 메소드를 오버라이딩 하는 경우
    // 반드시 접근제한자를 public 으로 해야 오버라이딩이 가능하다.
    void abstMethod();


    /* 하지만, static 메소드는 작성이 가능하다. ( JDK 1.8 추가된 기능 ) */
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨");
    }
    /* 또한 default 키워드를 사용하면 non-static 메소드도 작성 가능하다. ( JDK 1.8 추가된 기능 ) */
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨");
    }
}

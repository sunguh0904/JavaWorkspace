package section03.interfaceimplements;

public class Product extends Object implements InterProduct, java.io.Serializable {
    /* [ implements ]
    클래스에서 인터페이스를 상속받을 때 implements 키워드를 사용 ( 다중 상속 가능 )
    extends 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능
    단, extends 키워드를 앞에 작성하고 implements 를 뒤에 작성. ( 순서 바뀌면 에러 ) */

/*
    @Override
    public void nonStaticMethod() {}
*/

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct 의 nonStaticMethod 오버라이딩한 메소드 호출됨");
    }

    /* static 메소드는 오버라이딩 할 수 없다. */
/*
    @Override
    public static void staticMethod() {}
*/

    /* default 메소드는 인터페이스에서만 작성 가능하다. */
/*
    @Override
    public default void defaultMethod() {}
*/

    @Override
    public void abstMethod() {
        System.out.println("InterProduct 의 abstractMethod 오버라이딩한 메소드 호출됨");
    }

    /* default 키워드를 제외하면 오버라이딩이 가능하다. */
    // @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의 defaultMethod 호출됨");
    }
}

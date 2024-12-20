package section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        /*
        [ 추상클래스와 추상메소드 ]
        추상메소드를 0개 이상 포함하는 클래스를 추상클래스라고 한다
        추상클래스는 클래스 선언부에 abstract 키워드를 명시해야 한다
        추상클래스로는 인스턴스를 생성할 수 없다.
        추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야 한다
        이 때 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할 수 있다

        추상 클래스를 상속받아 구현할 때는 extends 키워드를 사용하며
        자바에서는 extends 로 클래스를 상속받을 시 하나의 부모 클래스만 가질 수 있다

        [ 추상 메소드 ]
        메소드의 선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다
        추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야 한다
        예) public abstract void method(); <- 중괄호가 없다.
         */

        // 추상 클래스는 인스턴스 생성 불가
        // Product product = new Product() {};

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 다형성 적용 -> 추상클래스를 레퍼런스 타입으로 활용 */
        Product product = new SmartPhone();
        /* 동적 바인딩에 의해 SmartPhone 의 메소드가 호출 된다. */
        product.abstractMethod();
        // 런타임 실행 전 까지는 클래스 Product 에 abstract 를 표시하지만 실행 후 SmartPhone 의
        // abstract 가 호출 됨

        product.NonStaticMethod();

        /* static 메소드는 그냥 사용 가능(인스턴스 생성 불필요) */
        Product.staticMethod();
    }
}

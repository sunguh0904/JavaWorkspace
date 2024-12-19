package section06.singleton;

public class EagerSingleton {
    /*
    클래스가 초기화 되는 시점에서 인스턴스를 생성한다.
     */
    private static EagerSingleton eager = new EagerSingleton();
    // static 을 쓰는 이유는 인스턴스를 매번 만들지 않고 처음에 지정해준 하나를 계속 재사용을 한다.
    // 쓰지 않을 경우 객체를 하나하나 만들어줘야 한다

    /* 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한 */
    private EagerSingleton() {}

    // private 로 접근제한이 걸려있지만 같은 클래스 내에서는 사용이 가능하고 그걸 public 으로
    // 만들어서 반환값으로 만들어주면 다른 곳에서 사용할 때 getEager 을 호출하면 사용이 가능하다.
    public static EagerSingleton getInstance() {
        return eager;
        // 반환값을 레퍼런스 변수로 할 것이다.
    }
}

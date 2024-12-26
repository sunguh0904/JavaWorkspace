package section06.singleton;

public class LazySingleton {
    // 클래스가 초기화 되는 시점에 필드를 선언해두고 null 로 초기화한다
    private static LazySingleton Lazy;      // 선언만 한 상태

    private LazySingleton() {}
    // 초기화

    // 게으른 초기화
    public static LazySingleton getInstance() {
        if (Lazy == null) {
            Lazy = new LazySingleton();
            // 필드값이 == null(없을)값인 경우, 새로 만들어라
        }
        return Lazy;
        // 생성한 적이 있으면 Lazy 를 반환한다.
    }
}

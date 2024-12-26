package section06.statickeyword;

public class StaticMethodTest {
    // 인스턴스
    private  int count;
    public void nonStaticMethod() {
        // 인스턴스 생성 후 사용 가능한 메소드이기 때문에 this 에 주소가 들어있다.
        this.count++;
        System.out.println("nonStaticMethod 호출됨");
    }

    public static void staticMethod() {
        // static 은 객체를 생성하지 않고 클래스를 불러와서 메소드 호출을 하기 때문에
        // 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this 에는 주소가 들어갈 수 없다
        // this.count++;
        System.out.println("staticMethod 호출됨");
    }
}

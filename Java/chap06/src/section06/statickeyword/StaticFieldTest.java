package section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int StaticCount;
    public StaticFieldTest(){}
    // 초기화

    public int getNonStaticCount() {
        return this.nonStaticCount;
        // getter 는 반환형 리턴
    }

    public int getStaticCount() {
        // static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근
        // this. 으로도 접근은 가능하지만 this. 을 사용하지 않는 것이 좋다
        return StaticFieldTest.StaticCount;
        // ( 클래스명 . 필드명 )
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.StaticCount++;
    }
}

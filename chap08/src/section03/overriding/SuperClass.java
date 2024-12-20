package section03.overriding;

public class SuperClass {
    /*
    [ 오버라이딩 성립 요건 ]
    1. 메소드의 이름이 동일해야 한다.
    2. 메소드의 리턴 타입이 동일해야 한다.
    3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.
    4. private 메소드는 접근이 불가능하기 때문에 또 어나이딩이 불가능
    5. Final 키워드가 사용된 메소드는 오버라이딩이 불가능
    7. 예외처리는 같은 예외이거나 더 구체적(하위)인 예외를 처리해야 한다. <- 예외처리 챕터에서 다룸
     */

    public void method(int num) {}
    private void privateMethod() {}
    public final void finalMethod() {}
    protected void protectedMethod() {}
}

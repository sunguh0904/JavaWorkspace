package section03.overriding;

public class SubClass extends SuperClass {
    /* 메소드 이름 변경 시 어노테이션 에러 */
/*
    @Override
    public void method2(int num) {}
*/

    /* 메소드 리턴타입 변경 에러*/
/*
    @Override
    public int method(int num)(){return 0}
*/

    /* 매개변수 갯수, 타입 변경 에러 */
/*
    @Override
    public void method(String num){}
    @Override
    public void method(int num, String num){}
*/

    /* private 메소드는 오버라이딩 불가 */
/*
    @Override
    private void privateMethod(){}
*/

    /* final 메소드는 오버라이딩 불가 */
/*
    @Override
    public final void finalMethod(){}
*/

    /* default 메소드는 더 좁은 범위여서 오버라이딩 불가능 */
/*
    @Override
    void protectedMethod(){}
*/

    /* 범위가 같아 가능 */
/*
    @Override
    protected void protectedMethod(){}
*/

    @Override
    public void method(int num){}
}

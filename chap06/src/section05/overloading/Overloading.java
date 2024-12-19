package section05.overloading;

public class Overloading {
    /*
    [ 오버로딩의 사용 이유 ]
    매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다
    이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관라하기가 매우 까다롭다
    따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야하는 여러 메소드를
    동일한 이름으로 관리하기 위해 사용하는 기술을 오버로딩이라고 한다.

    [ 오버로딩 조건 ]
    동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성
    한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
    메소드의 시그니쳐(signature)가 다르면 다른 메소드로 인식
    즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립

    [ 메소드의 시그니쳐 ]
    public void method(int num) {} 이라는 메소드가 있으면
    메소드명과 파라미터(매개변수) 선언부인 method(int num) 부분이 메소드의 시그니쳐
    메소드의 시그니쳐가 달라야 오버로딩이 성립되므로, 접근 제한자나 반환타입은 오버로딩 성립 요건에 해당 안 됨
     */

    // 메소드 시그니처가 동일한 경우 컴파일 에러 발생
    // public void test() {}
    public void test(){}

    // 접근제한자는 메소드 시그니처에 해당되지 않음
    // private void test(){}

    // 반환형은 메소드 시그니처에 해당되지 않음
    // public int test() { return 0;}
    // 파라미터 선언부는 메소드 시그니처에 해당된다.
    public void test( int num){}

    // 매개변수 이름은 메소드 시그니처에 영향을 주지 않는다.
    // public void test(int num2){}
    public void test(double num){}
    public void test1(double num){}

    // 매개변수 갯수에 따른 오버로딩 성립
    public void test(int num, int num2){}

    // 매개변수 타입변화에 따른 오버로딩 성립
    public void test(int num, String name){}

    //매개변수 순서에 따른 오버로딩 성립
    public void test(String name, int num){}

}

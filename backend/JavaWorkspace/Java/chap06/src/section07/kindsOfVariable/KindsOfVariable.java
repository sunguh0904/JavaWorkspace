package section07.kindsOfVariable;

public class KindsOfVariable {
    /*
    클래스 영역에 작성하는 변수를 필드라고 한다.
    필드 == 전역변수(클래스 전역에서 사용할 수 있는 변수) == 멤버변수(클래스가 가지는 멤버라는 의미)
     */

    //객체 non-static field 를 인스턴스변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미)
    private int globalNum;

    //클래스 static field 를 정적필드(클래스변수)라고 한다. 클래스 영역에 생성되는 변수라는 의미
    // 전역변수 == 클래스 내에 생성된 것
    private static int staticNum;

    public void testMethod(int num) {
        // 메소드영역의 시작
        /* 메소드의 괄호 안에 선언하는 변수를 매개변수(parameter)라고 한다
        메소드 영역에서 작성되는 변수를 지역변수라고 한다.
        매개변수도 일종의 지역변수로 생각하면 된다.*/

        // 메소드 안에서 생성된 지역변수, 해당 영역 안에서만 사용이 가능
        int localNum;

        // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.
        System.out.println(num);

        // 지역변수는 선언 외에 다시 사용(호출)하기 위해서는 반드시 초기화가 되어야 한다
        // System.out.println(localNum);

        // 전역변수는 클래스 전역에서 사용 가능
        System.out.println(globalNum);
        System.out.println(staticNum);
    }

    public void testMethod2(){
        // 지역변수는 해당 지역에서만 사용 가능
        // System.out.println(localNum);

        // 전역변수는 다른 메소드에서도 사용 가능
        System.out.println(globalNum);
        System.out.println(staticNum);
    }
}

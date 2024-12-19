package section06.singleton;

public class Application1 {
    public static void main(String[] args) {
            /*
    [ singleton pattern ]
    애플리케이션 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어
    하나의 인스턴스를 공유해서 사용하며 메모리 낭비를 방지할 수 있게 함
    ( 매번 인스턴스를 생성 하지 않음 )

    장점
    1. 첫 번재 이용 시 인스턴스를 생성해야 하므로 속도차이가 나지 않지만
        두 번째 이용 시 인스턴스 생성 시간 없이 사용할 수 있다.
    2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 없다.

    단점
    1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다
        (유지보수와 테스트에 문제점이 있음)
    2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.

    [상글톤 구현 방법 ]
    1. 이른 초기화( Eager Initialization)
    2/ 게으른 초기화( Lazy Initialization)
     */

    /* 이른 초기화 구현
    생성자를 이용하여 인스턴스 생성을 하지 못하고 getInstance() 메소드를 호출해야만 인스턴스를 생성할 수 있다.
     */
    // EagerSingleton eager = new EagerSingleton();
    // 생성자가 private 라 다른 클래스에서 가져오는 것이 제한되어 있다.
    // 클래스명 레퍼런스변수 = 클래스명.호출할 메소드
    EagerSingleton eager1 = EagerSingleton.getInstance();
    EagerSingleton eager2 = EagerSingleton.getInstance();
    System.out.println("ea1 의 hashCode : " + eager1.hashCode());
    System.out.println("ea2 의 hashCode : " + eager2.hashCode());
    // 같은 값이 나오는 이유는 호출 된 객체가 하나 밖에 없기 때문이다
    }
}

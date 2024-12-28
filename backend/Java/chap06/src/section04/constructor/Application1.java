package section04.constructor;

public class Application1 {
    public static void main(String[] args) {
        /*
        클래스명 변수명 = new 클래스명();

        클래스명 레퍼런스변수 = new 생성자();
        (올바른 표기법)

        [ 생성자란? ]
        인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출
        생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
        기본 생성자는 compiler 에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
        (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 작성하지 않은 것)
         */

        User user1 = new User();
        System.out.println(user1.getInformation());

        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInformation());

        // new java.util.Date() 요일, 월, 일, 시간:분:초, KST 년
        User user3 = new User("User02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInformation());
    }
}

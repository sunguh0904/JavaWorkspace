package section01.extend;

public class FireCar extends Car {
    // extends 를 적으면 FireCar 가 Car 에게 상속 받는다. 라는 의미
    // 기본 생성자와 private 는 상속을 받을 수 없다

    public FireCar() {
        super();
        // 부모의 기본 생성자를 호출하는 구문, 써도 되고 안 써도 된다 컴파일러가 알아서 추가해줌
        System.out.println("FireCar 클래스 기본 생성자 호출됨");

        /*
        [ @Override 어노테이션 ]
        오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생
        오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성
        부모에게 상속받은 메소드가 잘 작동하는지 확인 기능
         */
    }

    @Override
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빠앙~빼앵!");
        }else {
            System.out.println("소방차가 앞으로 갈 수 없습니다.");
        }
    }

    // 물 뿌리는 기능 추가 == 확장 기능
    public void sprayWater() {
        System.out.println("물을 뿌립니다.");
    }
}

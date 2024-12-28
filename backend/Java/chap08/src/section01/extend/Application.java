package section01.extend;

public class Application {
    public static void main(String[] args) {

    /*
    [ 상속(Inheritance) ]

    현실세계 상속과 비슷한 개념
    부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미
    클래스 또한 부모클래스와 자식클래스로 역할을 나누어서 부모가 가지는 멤버를 자식이 물려받아
    자기의 멤버인 것 처럼 사용할 수 있도록 만든 기술
    단순히 물려받는 개념에서 조금 더 나아가 자바에서의 상속은 부모클래스의 확정(extend) 개념
    물려받아 자신의 것처럼 사용할 분 아니라 추가적인 멤버 작성도 가능
    특히 메소드 재정의(overriding)라는 기술을 이용해 부모가 가진 메소드를 재정의하는 것도 가능

    [ 메소드 재정의(overriding)
    부모가 가지는 메소드 선언부를 그대로 사용하면서
    자식클래스가 정의한 메소드대로 동작하도록 구현부 부분을 새롭게 다시 작성하는 기술
    메소드 재정의를 하면 메소드 호출 시 재정의한 메소드가 우선적으로 동작

    [ 상속의 이점 ]
    1. 새로운 클래스 작성 시 기존에 자석한 클래스를 재사용 할 수 있다.
    1-1. 재사용 시 생산성을 크게 향상시킬 수 있다.(새롭게 작성하는 것보다 빠르다)
    1.2 공통적으로 사용하는 코드가 부모클래스에 존재하면 수정사항 발생 시 부모클래스만 수정해도
        전체적으로 적용된다.(유지보수성 증가)

    2. 클래스 간의 계층 관계가형성되며 다형성의 문법적인 토대가 된다

    [ 상속의 단점 ]
    1. 부모클래스의 기능을 추가/변경할 경우 자식클래스가 정상 동작하는지 예측이 힘들다
        상속 구조가 복잡해질수록 그 여향에 대한 예측이 힘들며 이런 단점이 유지보수성이 증가한다는 장점과 반대로
        유지보수에 악영향을 준다

    2. 부모클래스의 변경 또한 쉽지 않다
        자식클래스에서 중요하게 사용하는 기능인 경우, 부모클래스 변경 시 자식클래스에 모두 영향을 줄 수 있다.
    3. 부모클래스에서는 의미 있었던 기능이 자식클래에서는 무의미할 수 있다.( 불필요한 기능이 추가 )

    상속은 재사용이라는 장점만 바로보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지 않은 코드를 작성할 확률이 높다
    상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다.

     */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        // FireCar is a Car(o) / Car is a FireCar(x)
        // RacingCar is a Car(o) / Car is a RacingCar(x)
        System.out.println("============================");

        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

        System.out.println("============================");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }
}

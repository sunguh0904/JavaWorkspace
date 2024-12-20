package section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        /*
        [ 다형성 ]
        하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미
        하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
        하나의 메소드를 호출하여 객체별로 각기 다른 방법을 동작하게 할 수도 있다

        [ 다형성의 장점 ]
        1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가
        2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
            이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점
        3. 확장성이 좋은 코드를 작설할 수 있다
        4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
         */

        System.out.println("==============================");

        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println("==============================");

        Cat cat = new Cat();
        cat.eat();
        cat.run();
        cat.cry();
        cat.jump();
        System.out.println("==============================");

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();
        System.out.println("==============================");

        /* Cat 과 Tiger 는 Animal 클래스를 상속 받았다
         * 따라서 Cat 은 Cat 타입이기도 하면서 Animal 타입이기도 하며
         * Tiger 는 Tiger 타입이기도 하면서 Animal 타입이기도 하다. */

        // 다형성 = 부모 타입의 레퍼런스 변수에 자식의 인스턴스 주소를 저장할 수 있다.
        // 동적 바인딩 이라고 한다
        Animal a1 = new Cat();
        Animal a2 = new Tiger();

        // 반대로 자식 타입으로 부모 인스턴스 주솟값을 저장하려고 하면 에러
/*
        Cat cat1 = new Animal();
        Tiger tiger1 = new Animal();
*/

        /*
        [ 동적바인딩 ]
        컴파일 당시에는 (선언한)해당 타입의 메소드와 연결되어 있다가
        런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작
         */

        // 부모 클래스의 cry 에 연결 되어있지만 런타임 실행시 고양이, 호랑이의 메소드가 호출된다.
        a1.cry();
        a2.cry();
        System.out.println("==============================");

        /* 현재 레퍼런스 변수의 타입은 Animal 이기 때문에
        Cat 과 Tiger 가 가지고 있는 고유한 기능을 동작시키지 못 한다. */
/*
        a1.jump();
        a2.bite();
*/

        /*
        [ 클래스 타입 형변환(class type casting) ]
        타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 classCastException 이 발생할 수 있다.
         */

        // 강제 형변환 처럼 앞에 (클래스) 를 넣어주고 우선 순서를 정해주기 위해 ((클래스)ai) 소괄호를 한 번 더 씌어준다
        ((Cat)a1).jump();
        ((Tiger)a2).bite();
        System.out.println("==============================");

        // 고양이는 호랑이가 될 수 없다.
        // ((Tiger)a1).bite();

        /* 레퍼런스 변수가참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자 instanceof */
        // (비교값1 instanceof 비교값2) = true / false
        System.out.println("==========InstanceOf==========");
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1이 Cat 타입인지 확인 : " + (a1 instanceof Cat));
        /* 상속 받은 타입도 함게 가지고 있다.(다형성) */
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        /* 모든 클래스는 Object 의 후손이다. */
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));
        System.out.println("==============================");

        if (a1 instanceof Cat) {
            ((Cat) a1).jump();
        }
        if (a1 instanceof Tiger){
            ((Tiger)a1).bite();
        }
        System.out.println("==============================");

        /* 클래스의 업캐스팅과 다운캐스팅 확인
         up-casting : 상위 타입으로 형변환
         down-casting: 하위 타입으로 형변환 */

        // up-casting 명시적 형변환
        Animal animal1 = (Animal) new Cat();

        // up-casting 묵시적 형변환
        Animal animal2 = new Cat();

        // down-casting 명시적 형변환
        Cat cat1 = (Cat) animal1;

        // down-casting 묵시적 형변환 불가능
        // Cat cat2 = animal2;
    }
}

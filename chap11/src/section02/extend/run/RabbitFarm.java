package section02.extend.run;

public class RabbitFarm< T extends  Rabbit & Animall> {
    /* 제네릭 클래스로 인터페이스를 상속받을 때는 extends 를 사용해야 된다
    클래스와 인터페이스의 상속을 받을 때는 앞에는 클래스 뒤에는 인터페이스가 와야한다
    '&' 로 여러 타입을 동시에 가지는 타입 변수를 지정할 수 있다 */

    private T animal;

    public RabbitFarm() {};

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return this.animal;
    }
}

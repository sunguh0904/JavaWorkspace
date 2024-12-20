package section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Application3 app3 = new Application3();

        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        // 동일한 타입이기 때문에 가능함
        app3.feed(animal1);
        app3.feed(animal2);

        Cat animal3 = new Cat();
        Tiger animal4 = new Tiger();

        // 명시적 up-casting 형변환
        app3.feed((Animal) animal3);
        app3.feed((Animal) animal4);

        // 뭉시적 형변환
        app3.feed(animal3);
        app3.feed(animal4);

        app3.feed((new Cat()));
        app3.feed(new Tiger());
    }

    /* 다형성 적용 */
    public void feed(Animal animal) {
        animal.eat();
    }
/*
    public void feed(Cat cat){

    }

    public void feed(Tiger tiger) {

    }
*/
}

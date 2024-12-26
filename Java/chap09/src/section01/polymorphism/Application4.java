package section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();
        // app4 클래스에 getRandomAnimal 을 호출 후 randomAnimal 에 저장
        randomAnimal.cry();
    }

    public Animal getRandomAnimal() {
        int random = (int)(Math.random()*2);
        return random == 0? new Cat(): new Tiger();
    }
}

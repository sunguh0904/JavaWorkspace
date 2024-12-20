package section01.polymorphism;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("고양이가 생선을 먹고 있습니다.");
        // Animal 클래스에 먹이를 먹는다 를 재정의 하는 중
    }
    @Override
    public void run() {
        System.out.println("고양이가 달려갑니다.");
    }
    @Override
    public void cry() {
        System.out.println("고양이가 울음소리를 냅니다.");
    }

    public void jump() {
        System.out.println("고양이가 점프를 합니다.");
    }
}

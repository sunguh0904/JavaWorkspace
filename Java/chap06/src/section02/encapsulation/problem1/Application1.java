package section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        // 메서드가 없는 다른 클래스의
        monster1.name = "두치";
        monster1.hp = 200;
        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster2 hp : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        // Monster 클래스의 setHp 메소드를 호출해서 매개변수에 -200을 입력
        System.out.println("monster4 name : " + monster3.name);
        System.out.println("monster4 hp : " + monster3.hp);
    }
}

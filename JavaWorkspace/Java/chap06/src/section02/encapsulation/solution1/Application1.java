package section02.encapsulation.solution1;

public class Application1 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.kinds = "드라큘라";
        monster1.setHp(-100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(-100);

        Monster monster4 = new Monster();
        monster4.setInfo("미이라");
        monster4.setHp(400);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());
    }
}

package section02.encapsulation.problem2;

public class Application1 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄슈타인";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미이라";
        monster3.hp = 400;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        System.out.println("====================================");

        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        System.out.println("====================================");

        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);

        System.out.println("====================================");
}

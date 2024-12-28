package section02.encapsulation.solution2;

public class Application2 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        // monster1.kinds = "프랑켄슈타인";
        // monster1.hp = 200;
        // private 로 작성해서 에러 발생

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);
        System.out.println(monster1.getInfo());
    }
}

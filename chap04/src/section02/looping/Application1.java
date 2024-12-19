package section02.looping;

public class Application1 {
    public static void main(String[] args) {
        A_for a = new A_for();
        a.simpleForStatement();
        a.testForExample();
        a.testExample2();
        a.testForExample3();
        a.testForExample4();

        A_nestedFor a1 = new A_nestedFor();
        a1.printGugudanFrowTwoTonNine();
        a1.printStarInputRowTimes();

        B_while b = new B_while();
        b.simpleWhileStatement();
        b.whileExample1();
        b.whileExample2();
        b.whileExample3();
    }
}

package section03.branching;

public class Application1 {
    public static void main(String[] args) {
        A_break a = new A_break();
        a.simpleBreakStatement();
        a.simpleBreakStatement2();
        a.testJumpBreak();

        B_continue b = new B_continue();
        b.simpleContinueStatement();
        b.simpleContinueStatement2();
        b.testJumpContinue();
    }
}

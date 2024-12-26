package section02.usrexception;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();

        try {
/*
            exceptionTest.checkEnoughMoney(50000, 30000);
            exceptionTest.checkEnoughMoney(-50000, 50000);
            exceptionTest.checkEnoughMoney(50000, -50000);
*/
            exceptionTest.checkEnoughMoney(30000, 50000);
        }catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

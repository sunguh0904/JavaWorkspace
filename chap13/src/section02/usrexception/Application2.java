package section02.usrexception;

import section02.usrexception.exception.MoneyNegativeException;
import section02.usrexception.exception.NotEnoughMoneyException;
import section02.usrexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            exceptionTest.checkEnoughMoney(20000,10000);

        }catch (NotEnoughMoneyException notEnoughMoneyException) {
            System.out.println("NotEnoughException 발생!");
            System.out.println(notEnoughMoneyException.getMessage());

        }catch (PriceNegativeException priceNegativeException) {
            System.out.println("PriceNegativeException 발생!");
            System.out.println(priceNegativeException.getMessage());

        }catch (MoneyNegativeException moneyNegativeException) {
            System.out.println("MoneyNegativeException 발생1");
            System.out.println(moneyNegativeException.getMessage());

        }finally {
            System.out.println("finally 블록 내용 동작!");
        }

        System.out.println("프로그램을 종료 합니다.");
    }
}

package section02.usrexception;

import section02.usrexception.exception.MoneyNegativeException;
import section02.usrexception.exception.NotEnoughMoneyException;
import section02.usrexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new NotEnoughMoneyException("가지고 있는 돈 보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요.");
    }
}

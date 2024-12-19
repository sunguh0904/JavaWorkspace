package section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /* 증감연산자
        피연산자의 앞 or 뒤에 사용이 가능하다
        '++' : 1 증가의 이미
        '--' : 1 감소의 이미
         */

        int num = 20;
        System.out.println("num : " + num);

        num++; // 1 증가
        System.out.println("num : " + num);

        ++num; // 1 증가
        System.out.println("num : " + num);

        num--; // 1 감소
        System.out.println("num : " + num);

        --num; // 1 감소
        System.out.println("num : " + num);

        /* 증감 연산자는 다른 연산자와 함께 사욜할 때 의미가 달라진다
        다른 연산자와 함께 사용할 때 증감 연산자의 의미
        'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
        '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행
        'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
        '--var' : 피연산자의 값을 먼저 1을 감소시킨 후 다른 연산을 진행
         */

        int firstNumber = 20;
        int result1 = firstNumber++ *3;
        System.out.println("result1 = " + result1);
        System.out.println("firstNumber : " + firstNumber);

        int secondNumer = 20;
        int result2 = ++secondNumer *3;
        System.out.println("result2 : " + result2);
        System.out.println("secondNumber : " + secondNumer);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);
    }
}

package section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        /* 대입 연산자와 산술 복합 대입 연산자
        '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입
        '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입
        '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입
        '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입
        '/=' : 왼쪽의 피연산자에 오른쪽의 피연사자를 나눈 결과를 왼쪽의 피연산자에 대입
        '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입
         */

        int num = 12;
        System.out.println("num = " + num);

        num += 3; // num = num + 3;
        System.out.println("num = " + num);

        num -= 5; // num = num - 5;
        System.out.println("num = " + num);

        num *= 2; // num = num * 2;
        System.out.println("num = " + num);

        num /= 2; // num = num / 2;
        System.out.println("num = " + num);

        num %= 2; // num = num % 2;
        System.out.println("num = " + num);

    }
}

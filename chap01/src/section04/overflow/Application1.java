package section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 자료형 별 값의 최대 범위를 벗어나는 경우
        발생한 carry를 버림처리 하고 sign bit를 반전시켜 최고 값으로 순환시킴
         */

        // overFlow

        // 127 byte의 최대 저장 범위
        byte num1 = 127;
        System.out.println("num1 : " + num1); // 127 : byte의 최대 저장 범위

        num1++; // num1 = num1 + 1 // 1 증가

        // 최대 값을 넘어갈 경우 최소 값으로 순환 시킨다
        System.out.println("num1 overflow : " + num1); // -128 byte

        /* underFlow
        overFlow와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상
         */

        byte num2 = -128;
        System.out.println("num2 : " + num2); // -128 // byte의 최소 저장 범위

        num2--; // num2 = num2 - 1 // 1감소

        // 최소 값을 넘어갈 경우 최대 값으로 순환 시킨다
        System.out.println("num2 underFlow : " + num2); // 127 : byte의 최대 저장 범위

        int firstNum = 1000000; // 100만
        int secondNum = 700000; // 70만

        int multi = firstNum * secondNum; // 7천 억
        System.out.println("firstNum * secondNum : " + multi);

        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum : " + longMulti);

        /* 앞에 int 자료로 변수를 선언 했기에 다시 long으로 변수를 선언해도 int의 값으로 연산된다
        변경하려면 long 변수 값 앞에 (long)을 입력해 강제로 형변환 시켜줘야 제대로 된 값이 나온다.
         */
        long result = (long)firstNum * (long)secondNum;
        System.out.println("firstNum * secondNum : " + result);
    }
}

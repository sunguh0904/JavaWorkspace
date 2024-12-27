package section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void simpleSwitchStatement() {
        /*
        [ switch 문 표현식 ]
        switch(비교할변수) {
        case 비교 값1 : 비교할 변수의 값 == 비교 값1 인 경우 실행할 구문; break;
        case 비교 값2 : 비교할 변수의 값 == 비교 값2 인 경우 실행할 구문; break;
        default : 위 case 에 모두 해당하지 않는 경우 실행할 구문; break;
        break : 구문 마다 걸어주지 않으면 ture 의 값이 나와도 다음 구문을 계속 실행, 그것을 막아주는 역할
         */

        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        System.out.print("첫 번째 정수 입력 : ");
        int firstNum = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();

        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);
        // 문자 값을 받을 때 사용 .charAt(여기는 몇 번째를 받을 것인지 순서 index 값)

        /* 연산 결과를 저장할 변수 */
        int result = 0;

        switch (op) {
            // op 에 내가 입력한 연산자를 받아서 아래 있는 기호 중에 맞는 것을 출력
            case '+' : result = firstNum + secondNum; break;
            case '-' : result = firstNum - secondNum; break;
            case '*' : result = firstNum * secondNum; break;
            case '/' : result = firstNum / secondNum; break;
            case '%' : result = firstNum % secondNum; break;
            default:
                // 아무것도 없다면 default 가 출력
                System.out.println("잘못된 연사자를 입력 하였습니다.");
        }
        System.out.println(firstNum + " " + op + " " + secondNum + " " + result);
    }

    public void switchVendingMachine() {
        /*
        < switch-case >문 이용 실습
        1. scanner 를 이용해 음료 이름(String)과 갯수(int)를 입력 받는다.
        2. switch-case 문을 사용해 전체 가격을 구한다.
        3. [ '음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해 주세요. ]
        위와 같이 출력되도록 한다.
         */

        System.out.println("==========Ohgiraffers Vending Machine==========");
        /* 코카콜라 1,700 원 / 환타 1,200 원 / 하늘보리 1,000 원, 핫식스 2,000 원*/
        System.out.println("코카콜라     환타     하늘보리     핫식스");
        System.out.println("=================================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("음료 이름 : ");
        String name = sc.next();

        System.out.print("음료 수량 : ");
        int number = sc.nextInt();

        int result = 0;
        // 내가 다음에 원하는 값을 담기 위해 변수를 초기화 해준다.

        switch (name) {
            // (name) 내가 어떤 값을 입력 했을 때 case 에서 입력된 값을 찾아 그 값을 계산하도록 한다.
            case "코카콜라" : result = 1700 * number; break;
            // 코카콜라를 입력하여 1700 원 짜리를 몇개 샀는지에 대해 * 개수를 result 변수에 담는다.
            case "환타" : result = 1200 * number; break;
            case "하늘보리" : result = 1000 * number; break;
            case "핫식스" : result = 2000 * number; break;
            default: System.out.println("잘못된 값을 입력 하였습니다.");return;
            // default 문구 마지막에 return 값을 넣으면 입력 값이 모두 false 가 나와서
            // default 출력 후 아래 출력문이 나오는 것을 막을 수 있다
            // return 이 입력 되면 그 뒤에 어떠한 것이 있더라도 실행하지 않는다.
            // switch 문에 default 문에 return 값을 많이 사용한다.
        }
        System.out.println(name + "를 " + number + "개 선택하셨습니다. " + result + " 원 을 투입해주세요");
    }
}

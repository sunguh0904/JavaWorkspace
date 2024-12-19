package section02.looping;

import java.util.Scanner;

public class B_while {
        /*
    [ while 문 표현식 ]
    초기식;
    while (조건식) {
        조건을 만족하는 경우 수행할 구문 (반복 구문) ;
            증감식 ;
    }
     */

    public void simpleWhileStatement() {
        int i = 1;
        while( i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void whileExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        /*
        charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 변환
        length() : String 클래스의 메소드로 문자열의 길이를 int 형으로 반환
        index 는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
         */

        System.out.println("for 문");
        for (int i = 0; i < str.length(); i++) { //test str.length 로 반환 하면 정수 4가 나온다 4byte
            // i 가 4보다 작으면 아래 식 실행
            char ch = str.charAt(i);
            // test 의 0번째 순서를 ch 에 저장
            System.out.println(i + " : " + ch);
        }

        System.out.println("while 문");
        int index = 0;
        while (index <= str.length()) {
            char ch = str.charAt(index);
            System.out.println(index + " : " + ch);
            index++;
        }
    }

    public void whileExample2() {
        /*
        정수 하나를 입력 받아 1부터 입력받은 정수까지의 합계를 구한다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        int i = 1, sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("1부터 입력 받은 정수 " + num + " 가지의 합은 " + sum + " 이다.");
    }

    public void whileExample3() {
        int dan = 2;
        while (dan < 10) {
            // 2는 10보다 작나? 작으면 아래 식 실행
            int su = 1;
            while (su < 10) {
                // 1은 10보다 작나? 작으면 아래 식 실행
                System.out.println(dan + " * " + su + " = " + (dan * su));
                //첫 순환에서 dan 은 2이고 su 는 1이니 출력문 한 번 실행
                // 이후 아래 su++ 을 실행
                su++;
                // su 가 아직 10보다 작으니 9까지 반복 하면서 9가 되면 아래 식 실행 그 때 가지 출력문 반복 실행
            }
            System.out.println();
            // 가독성을 위해 한 칸 띄우기
            dan++;
            // su 가 첫 순환 때 9가 되어 dan 이 1 증가가 되어 처음 식으로 올라감
            // dan 은 3이 되고 다시 su 는 1부터 시작해 9까지 무한 반복
            // dan 과 su 가 9가 되면 실행 종료
        }
    }
}

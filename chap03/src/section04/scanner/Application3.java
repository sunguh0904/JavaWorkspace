package section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 스캐너 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        그래서 크게 두 가지 사항을 주의해야 한다.
        1. next() 로 문자열 입력 받은 후 정수, 실수, 논리 값을 입력 받을 때
        2. 정수, 실수 논리 값 입력 후 next() 로 문자열 입력받을 때
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next(); // 공백이나 개행문자 전 까지를 읽어온다.
        System.out.println("srt1 : " + str1);

        sc.nextLine();
        // 공백 뒤에 문자가 남아 있기에 다음 int 스캐너가 읽지 못 하도록 중간에 읽어서 삭제시킨다.

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 : " + num1);

        /* 정수, 실수, 논리 값 입력 후 nextLine() 으로 문자열 입력 받을 때 */

        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("입력하신 숫자는 : " + num2 + " 입니다.");

        System.out.print("공백이 있는 문자열을 하나 입력해 주세요 : ");

        sc.nextLine();

        String str2 = sc.nextLine();
        System.out.println("srt2 : " + str2);
        // 고기를 먹는 사람과 채소를 먹는 사람이 있다
        // 두 개의 고기가 있는데 고기를 먹는 사람이 고기 하나를 먹고 배가 불러 남은 고기를 버렸는데
        // 채소를 먹는 사람이 버린 고기를 먹어서 배가 탈났다(오류)
        // 고기 먹는 사람과 채소 먹는 사람 그 사이에 고기 먹는 사람을 더 배치해서 버려진 고기를 먹고
        // 채소 먹는 사람은 새로운 채소를 줘서 탈나지 않았다
    }
}

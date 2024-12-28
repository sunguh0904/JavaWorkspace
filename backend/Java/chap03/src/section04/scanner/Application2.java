package section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전 까지 읽어서 문자열로 반환(공백 포함)
        next() : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환(공백문자 포함하지 않음)
         */

        Scanner sc = new Scanner(System.in);
        // 스캐너 문법
        System.out.print("인사말을 입력해주세요 : ");
        String greeting = sc.nextLine(); // 안녕하세요 반가워요
        // 공백을 포함한 모든 문자를 출력함
        System.out.println(greeting);

        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next(); // 안녕하세요 반가워요
        // 공백을 포함하지 않아 공백 앞 까지만 출력함
        System.out.println(greeting2);
    }
}

package section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.scanner 를 이용 다양한 자료형 값 입력 받기 */
        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성 문법
        System.out.print("이름을 입력하세요 : ");
        // print 는 한 라인으로 이어서 사용할 수 있다.
        String name = sc.nextLine();
        // 문자열을 입력받는 메소드 nextLine();
        System.out.println("입력하신 이름은 " + name + " 입니다.");

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        // 정수를 입력받는 메소드 nextInt();
        System.out.println("입력하신 나이는 : " + age + " 입니다.");

        System.out.print("키를 입력해 주세요 : ");
        float height = sc.nextFloat();
        // 실수를 입력받는 메소드 nextFloat();
        System.out.println("입력하신 키는 : " + height + " 입니다.");

        System.out.print("True 또는 False 를 입력해주세요 : ");
        boolean itTrue = sc.nextBoolean();
        // 논리 값을 입력받는 메소드 sc.nextBoolean();
        System.out.println("입력하신 논리 값은 : " + itTrue + " 입니다.");

        sc.nextLine();
        System.out.print("아무 문자열을 입력해 주세요 : ");
        char ch = sc.nextLine().charAt(0);
        // 문자형 값을 입력받는 메소드 sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + " 입니다.");
    }
}

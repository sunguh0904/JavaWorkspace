package section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void simpleIfElseIfStatement() {
        /*
        [ if-elseif 문 표현식 ]
        if(조건식) {
            조건식1이 true 일 때 실행할 명령문;
        } else if(조건식2) {
            조건식1은 false 이고, 조건식2는 true 일 때 실행할 명령문;
        } else {
            조건식1, 2 모두 false 인 경우 실행할 명령문;
        }
         */
        System.out.println("펑~ 산신령이 나타났다!!");
        System.out.print("오느 도끼가 너의 도끼냐? (1. 금도끼 / 2. 은도끼 / 3. 쇠도끼) : ");
        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        int answer = sc.nextInt();
        // 1, 2, 3 선택의 정수를 사용할 것이기에 정수 스캐너를 선택

        if(answer == 1) {
            //스캐너의 값이 1과 같다면 ture 실행, false 면 else if 문을 실행
            System.out.println("거짓말 하지 말거라~~! 욕심이 과하구나 이놈!");
        } else if (answer == 2) {
            //스캐너의 값이 2와 같다면 ture 실행, false 면
            System.out.println("욕심을 크게 부리지는 않았지만 거짓말을 하는구나!!");
        } else {
            // 위에 모든 값에서 false 가 나왔을 때 마지막 실행
            System.out.println("너는 정말 정직하구나~ 다 가져가거라~!!");
        }
        System.out.println("산신령은 다시 연못 속으로 사라진다...펑~!");
        //처음 if 문에서 false 가 나오면 출력
    }

    public void nestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        // 이름은 문자열로 받기 때문에 nextLine
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();
        // 점수는 정수형으로 받기 때문에 nextInt

        /* 학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        if(point >= 90) {
            // point 가 90 보다 크거나 같다면
            grade = "A";
            // A 값을 출력 후 내부에 if 문이 하나 더 있어 95 보다 크거나 작은지 또한 실행한다.
            if(point >= 95) {
                grade += "+";
                // grade = grade + "+" => A+ 출력
            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        System.out.println(name + "학생의 점수는 " + point + "점 이고" + grade + "등급 입니다.");
    }
}

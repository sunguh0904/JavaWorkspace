package section01.array;

public class Application1 {
    public static void main(String[] args) {
        /*
        같은 자료형만 사용
        index 를 참조해서 순서로 찾을 수 있다
        객체는 heap 에 생성 된다.
        배열 변수의 주소 값을 찾는다
         */

        /*
        배열의 사용 이유
        1. 연속된 메모리 공간으로 데이터를 관리할 수 있다.
        2. 반복문을 이용한 연속 처리를 할 수 있다.
         */

        // 배열을 쓰지 않을경우
        int year1 = 95;
        int year2 = 96;
        int year3 = 97;
        int year4 = 98;
        int year5 = 99;

        String yearName1 = "19" + year1 + "년생";
        String yearName2 = "19" + year2 + "년생";
        String yearName3 = "19" + year3 + "년생";
        String yearName4 = "19" + year4 + "년생";
        String yearName5 = "19" + year5 + "년생";

/*
        for (int i = 1; i <= 5; i++) {
            String (yearName + i) = "19" + (year + i) + "년생";
        }
*/

        System.out.println(yearName1);
        System.out.println(yearName2);
        System.out.println(yearName3);
        System.out.println(yearName4);
        System.out.println(yearName5);
    }
}

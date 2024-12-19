package section01.array;

public class Application2 {
    public static void main(String[] args) {
        /*
        배열의 사용 방법
        1. 배열 선언
        2. 배열 할당(new 연산자 이용)
        3. 배열 인덱스 공간에 값 대입
         */

        /*
        배열 선언
        자료형[] 배열명;
        자료형 배열명[];

       stack 영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.
         */
        int[] iarr;

        // 배열 할당
        iarr = new int[5];
        // iarr = new int[]; // 배열의 크기를 할당해 주지 않으면 에러가 뜬다.

        // 선언과 동시에 배열 할당
        int[] iarr2 = new int[5];

        // 선언과 동시에 초기화
        int[] iarr3 = new int[] {11, 22, 33, 44, 55};
        // index 에 선언한 값이 하나씩 저장된다.

        for (int i = 0; i < iarr3.length; i++) {
            System.out.print("iarr3 :" + iarr3[i] + ", ");
            // iarr3[ 할당을 준 값의 몇 번재 값을 출력할 것인지 쓰는 곳 ]
        }

        int[] iarr4 = {111, 222, 333, 444, 555};
        // new 연산자를 사용하지 않고 {} 괄호를 통해 바로 선언과 동시에 초기화 가능
        for (int i = 0; i < iarr4.length; i++) {
            System.out.println(iarr4[i]);
        }

        String[] sarr = {"red", "orange", "yellow", "green", "purple"};
        // 문자열의 선언과 초기화
        for (int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }

        System.out.println(iarr);
        // hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환

        System.out.println("iarr 의 hashCode : " + iarr.hashCode());
        // hashCode() 출력문

        System.out.println("iarr 의 길이 : " + iarr.length);

        /* 배열의 한계점 : 길이 변경이 불가능함 */
        double[] darr = new double[10];
        System.out.println("hashCode 는 " + darr.hashCode() +  " / " + "길이는 " + darr.length);

        darr = new double[100];
        System.out.println("hashCode 는 " + darr.hashCode() +  " / " + "길이는 " + darr.length);
        // heap 에 저장된 배열 길이가 변경이 된 것이 아니고 덮어 씌어진 것이다

        /*
        배열의 인덱스 공간에 값 대입
         */

        /*
        < 값의 형태별 기본값 >
        1. 정수 : 0
        2. 실수 : 0.0
        3. 논리 : false
        4. 문자형 : \u0000
        5. 참조 : null
         */

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

        System.out.println("=====================");

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i]);
            // i 가 5(iarr.length)보다 작을 때 까지 출력하면서 1 증가
            // length 는 현재 배열을 5개를 가지고 있음
        }
        System.out.println("");

        System.out.println("========================");

        iarr[0] = 1;
        iarr[1] = 2;
        iarr[2] = 3;
        iarr[3] = 4;
        iarr[4] = 5;

        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = i + 1;
            System.out.print(iarr[i]+ " ");
        }

    }
}

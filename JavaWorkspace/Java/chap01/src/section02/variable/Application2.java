package section02.variable;

public class Application2 {
    public static void main(String[] args) {
        /* 정수를 취급하는 자료형 4가지 */
        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        /* 실수를 취급하는 자료형 2가지 */
        float fnum; // 4byte
        double dnum; // 8byte

        /* 문자를 취급하는 자료형 1가지 */
        char ch; // 2byte
        char ch2;

        /* 논리 값을 취급하는 자료형 1가지 */
        boolean isTure; // 1byte

        /* 문자열을 취급하는 자료형 */
        String str; // 4byte

        bnum = 1;
        snum = 2;
        inum = 4;
        // Long 변수는 값을 넣어줄 때 대문자 L을 붙여야 함
        // lnum = 8;
        lnum = 8L;

        // 자바는 실수 자료형은 double로 기본설정이 되어있음
        // float으로 사용하고자 하면 실수 뒤에 f를 붙여 사용한다고 선언해야 됨
        // 특수한 경우가 아니면 float은 사용하지 않음
        // fnum = 4.0;
        fnum = 4.0f;
        dnum = 8.0;

        ch = 'a';
        ch2 = 97;

        // true 혹은 false 중 한 가지의 값만 사용 가능하다.
        isTure = true;
        isTure = false;

        str = "안녕하세요";

        int point = 100;
        int bonus = 10;

        System.out.println("변수에 저장된 값 출력");
        System.out.println("bonus의 값 : " + bnum);
        System.out.println("sum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);

        System.out.println("ch의 값 : " + ch);
        System.out.println("ch2의 값 : " + ch2);

        System.out.println("isTrue의 값 : " + isTure);

        System.out.println("str의 값 : " + str);

        System.out.println("포인트와 보너스의 합은?" + ( point + bonus ));

        point = point + 100; // 200
        System.out.println("point = point + 100" + point);
    }
}

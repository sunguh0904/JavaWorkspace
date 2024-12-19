package section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다.
         */
        /* 그냥은 안 된다. 두 자료형의 연산 결과는 더 큰 쪽 자료형인 long이 되고
        long형 같은 int형 변수에 담길 수 없다. */
        // int isum = inum + lnum;
        int inum = 10;
        long lnum = 100;

        int isum = inum + (int) lnum; // long형을 int형으로 강제 형변형 한다.
        System.out.println("isum" + isum);

        int isum2 = (int)(inum + lnum); // 두 수의 연산 결과를 int형으로 변환한다.
        System.out.println("isum2 : " + isum2);

        long isum3 = inum + lnum; // 결과 값을 long형 자료형으로 받는다( 자동 형변환 이용 )
        System.out.println("isum3 : " + isum3);


        /* int 미만의 연산의 처리 결과는 int형이다 */
        byte byteNumber1 = 1;
        byte byteNumber2 = 2;
        short shortNumber1 = 3;
        short shortNumber2 = 4;

        int result1 = byteNumber1 + byteNumber2;
        int result2 = byteNumber1 + shortNumber1;
        int result3 = shortNumber1 + byteNumber1;
        int result4 = shortNumber1 + shortNumber2;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }
}

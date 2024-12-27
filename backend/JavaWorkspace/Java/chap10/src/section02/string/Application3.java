package section02.string;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {
        /* [ 문자열 분리 ]
        split() : 정규표현식을 이용하여 문자열을 분리한다.
        비정령화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
        정규표현식을 이용하기 때문에 속도가 느리다는 단점
        ( 정규표현식은 자바스크립트에서 다룰 예정 ) */

        String emp1 = "100/홍길동/서울/영업부";     // 모든 값 존재
        String emp2 = "200/유관순//총무부";        // 주소 없음
        String emp3 = "300/이순신/경기도/";       // 부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");
        for (int i = 0; i < empArr1.length; i++) {
            System.out.println("empArr1[" + i + "]" + empArr1[i]);
        }
        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("empArr2[" + i + "]" + empArr2[i]);
        }
        for (int i = 0; i < empArr3.length; i++) {
            System.out.println("empArr3[" + i + "]" + empArr3[i]);
        }

        /* StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        정형화된 문자열 패턴을 분리할 때 사용하기 좋다.( 공백 문자열 무시 )
        split()보다 속도면에서 더 빠르다
        구분자를 생략하는 경우 공백이 기본 구분자 */
        // 공백으로 존재하는 값을 무시해버린다.
        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while(st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }
        while(st2.hasMoreTokens()) {
            System.out.println("st2 : " + st2.nextToken());
        }
        while(st3.hasMoreTokens()) {
            System.out.println("st3 : " + st3.nextToken());
        }
        /* nextToken()으로 토큰을 꺼내면 해당 StringTokenizer 의 토큰을 재사용 하는 것이 불가능하다. */
        while(st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }
        /* split()은 정규표현식 이용(문자열 패턴), StringTokenizer 는 구분자 문자열 이용 */
        String colorStr = "red*orange#blue/yellow green";
        /* "*#/ " 이라는 문자열이 구분자로 존재하지 않아서 에러 발생함 */
        // String[] colors = colorStr.split("*#/ "); //에러남
        /* 대괄호로 묶은 문자열은 문자열이 아닌 각 문자들의 패턴으로 볼 수 있다.
         * 따라서 순서 상관 없이 존재하는 문자들을 이용해서 구분자로 사용할 수 있다.
         * */

        String[] colors = colorStr.split("[*/# ]"); //순서 상관 없음
        for(int i = 0; i < colors.length; i++) {
            System.out.println("colors[" + i + "] : " + colors[i]);
        }
        /* StringTokenizer 의 두 번째 인자 문자열 자체는 연속된 문자열이 아닌 하나하나를 구분자로 이용하겠다는 의미이다. */
        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*#/ ");
        while(colorStringTokenizer.hasMoreTokens()) {
            System.out.println(colorStringTokenizer.nextToken());
        }
    }
}

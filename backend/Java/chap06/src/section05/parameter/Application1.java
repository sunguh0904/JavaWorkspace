package section05.parameter;

public class Application1 {
    public static void main(String[] args) {
        /*
        매개변수(parameter)로 사용 가능한 자료형
        1. 기본자료형
        2. 기본자료형 배열
        3. 클래스 자료형(사용자 정의 자료형)
        4. 클래스 자료형 배열( = 객체 배열)
        5. 가변 인자
         */

        Parameter p = new Parameter();

        int num = 20;
        p.primaryTypeParameter(num);

        int[] iarr = new int[] {1,2,3,4,5};
        System.out.println("기본 자료형 배열 전달인자로 전달하는 값 : " + iarr);
        p.primaryTypeArrayParameter(iarr);

        System.out.print("변경 후 원본 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        // 객체를 생성하면서 바로 동시에 선언
        Rectangle r1 = new Rectangle(12.5,22.5);

        System.out.println("클래스 자료형 전달인자로 전달하는 값 : " + r1);
        // r1 을 넣은 이유는 위에 r1 의 width 값과 height 값을 가져오기 위해서다
        p.classTypeParameter(r1);

        System.out.println("변경 후 사각형의 넓이와 둘레");
        r1.calcArea();
        r1.calcRound();

        System.out.println("=========================================");
        // 인자가 아무것도 없는 경우 에러
        // p.variableLengthArrayParameter();

        // 가변인자는 전달인자에 적지 않아도 괜찮다
        p.variableLengthArrayParameter("홍길동");
        System.out.println();

        // 1개도 가능
        p.variableLengthArrayParameter("이순신", "볼링");
        System.out.println();

        // 여러 개도 가능
        p.variableLengthArrayParameter("장보고", "볼링", "당구", "축구");
        System.out.println();

        // 배열도 가능
        p.variableLengthArrayParameter("장보고", new String[] {"테니스", "서예", "탁구"});

    }
}

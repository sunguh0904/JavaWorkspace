package section01.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("값에 의미 부여 테스트");
        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");

        // 선언과 동시에 초기화 int : 변수 선언
        int salary = 1000000;
        int bonus = 200000;

        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        System.out.println("1번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트를 지급하였습니다.");

        int point = 100;
        System.out.println("1번 고객에게 포인트를" + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를" + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를" + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를" + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를" + point + "포인트를 지급하였습니다.");

        // 변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기 위한 공간
        System.out.println("변수에 저장된 값 변경 테스트");
        int sum = 0;
        System.out.println("현재 sum의 값은?" + sum);

        sum = sum + 10;
        System.out.println("sum에 10을추가로 더하면?" + sum);

        sum = sum + 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면?" + sum);

        int count = 0;
        count = count + 1;
        System.out.println("count에 1을 더하면 현재 count의 값은?" + count);
    }
}

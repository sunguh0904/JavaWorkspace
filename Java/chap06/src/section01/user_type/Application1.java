package section01.user_type;

public class Application1 {
    public static void main(String[] args) {
        /*
        변수를 이용한 회원 데이터 관리
         */

        String id = "user01";
        String pwd = "pass01";
        String name = "성우현";
        int age = 20;
        char gender = '남';
        String[] hobby = {"당구", "볼링", "배드민턴",};

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.print("hobby : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }

        System.out.println();
        System.out.println("====================================");

        Member member = new Member();
        // new Member heap 공간에 저장, 인스턴스 변수다
        // member stack 공간에 주솟값을 가지고 있다
        // 1.객체를 먼저 가져온다

        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);
        // 2.메소드를 작성하지 않은 다른 클래스의 변수명을 가져올 때 레퍼런스(클래스이름).필드(변수)명을 사용해준다
        /* 필드에 접근하기 위해서는 레퍼런스변수명.필드명으로 접근
        ' . ' 참조연산자 라고 하는데, 레퍼런스 변수가 참조하고 있는 주소로 접근한다는 의미
        각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근)
         */

        // 필드에 값을 부여하기
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"당구", "볼링", "배드민턴"};
        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
        System.out.print("변경 후 member.hobby : ");
        for (int i = 0; i < member.hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
        System.out.println("=========================================");
    }
}

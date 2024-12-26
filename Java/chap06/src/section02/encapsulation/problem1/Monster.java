package section02.encapsulation.problem1;

public class Monster {
    // String name;
    // int hp;

    // 전역변수 == 필드 == 속성 == 인스턴스변수
    String name;
    int hp;

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
            // this 는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수
            // 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근
            // 전역변수에 접근하기 위해서 this.을 명시해야 한다
            // this. 은 전역변수를 가르킨다 monster.hp 를 가르킨다
            // this 를 사용하지 않으면 매개변수의 hp 로 인식한다
        } else {
            System.out.println("음수가 입력되어 몬스터 체력을 0으로 변경합니다.");
            this.hp = 0;
        }
    }
}

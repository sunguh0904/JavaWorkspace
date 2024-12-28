package section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Tiger();
        animals[2] = new Cat();
        animals[3] = new Tiger();
        animals[4] = new Cat();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
            // 배열 인덱스 순번으로 각 클래스에 저장된 cry 메소드를 호출 후 실행
        }
        System.out.println("==============================");

        /* 각 클래스별 고유한 메소드를 동작시키게 하기 위해서는
        down-casting 을 명시적으로 해줘야 하는데,
        ClassCastException 을 방지하기 위해서는 instanceof 연산자를 이용해야 한다. */
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                // animals i 번째 순서가 Cat 타입과 같다면 jump 를 실행
                ((Cat) animals[i]).jump();
                // down-casting 명시적 적용

                // animals i 번째 순서가 Tiger 타입과 같다면 bite 를 실행
            }else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).bite();
                // down-casting 명시적 적용
            }else {
                System.out.println("호랑이나 고양이가 아닙니다.");
            }
        }
    }
}

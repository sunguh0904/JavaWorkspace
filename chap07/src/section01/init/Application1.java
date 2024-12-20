package section01.init;

public class Application1 {
    public static void main(String[] args) {
        /*
        객체 배열은 레퍼런스변수에 대한 배열
        생성한 인스턴스도 배열을 이용해서 관리
        동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속처리할 수 있어 유용
        또한 반환값은 1개의 값만 반환할 수 있기 때문
        동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용
         */

        Car car1 = new Car("1", 11);
        Car car2 = new Car("2", 12);
        Car car3 = new Car("3", 13);
        Car car4 = new Car("4", 14);
        Car car5 = new Car("5", 15);

        car1.driveMax();
        car2.driveMax();
        car3.driveMax();
        car4.driveMax();
        car5.driveMax();

        /* Car 타입의 인스턴스 주소를 보관할 5칸 짜리 배열 할당 */
        Car[] carArr = new Car[5];

        // 만든 배열에 순서로 값을 넣는다.
        carArr[0] = new Car("1",11);
        carArr[1] = new Car("2",12);
        carArr[2] = new Car("3",13);
        carArr[3] = new Car("4",14);
        carArr[4] = new Car("5",15);
        for (int i = 0; i < carArr.length; i++) {
            carArr[i].driveMax();
        }
        Car[] carArray2 = {
                new Car("1",11),
                new Car("2",12),
                new Car("3",13),
                new Car("4",14),
                new Car("5",15),
        };

        for (Car c : carArray2) {
            c.driveMax();
        }
    }
}

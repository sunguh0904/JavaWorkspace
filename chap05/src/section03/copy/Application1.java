package section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /*
        배열의 복사 종류
        1. 얕은복사(shallow copy) : stack 의 주소값만 복사
        2. 깊은복사(deep copy) : heap 의 배열에 저장된 값을 복사
         */

        /*
        얕은 복수난 stack 에 저장되어 있는 배열의 주소값만 복사한다는 것이다
        따라서 두 개의 래퍼런스 변수는 동일한 배열의 조값을 가지고 있다.
        하나의 래퍼런스 변수에 저자된 주소값을 가지고 배열의 내용을 수정하게 되면
        다른 래퍼런스 변수로 접근했을 때도 변경된 값이 반영되어 있다.
         */

        int[] originArr = {95, 96, 97, 98, 99};

        int[] copyArr = originArr;
        // 얕은 복사

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        System.out.println("값 변경 전 : " + originArr[4]);
        System.out.println("값 변경 전 : " + copyArr[4]);

        copyArr[4] = 90;

        System.out.println("값 변경 후 : " + originArr[4]);
        System.out.println("값 변경 후 : " + copyArr[4]);

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        /*
        [ 얕은 복사의 활용 ]
        주로 메소드 호출 시 인자로 사용하는 경우와
        리턴값으로 동일한 배열을 반환하고 싶은 경우 사용한다.
         */

        String[] team = {"권은지", "조용구", "이유란", "손석현"};
        System.out.println("team 배열 hashCode() : " + team.hashCode());

        // 인자와 매개변수로 활용
        printArr(team);

        //리턴값으로 활용
        String[] arrFromMethod = getArr();
        // getArr 의 메소드를 호출
        System.out.println("getArr()로 반환받은 배열 hashCode()" + arrFromMethod.hashCode());

    }

    // 인자 매개변수 활용
    public static void printArr(String[] arr) {
        System.out.println("printArr() 매개변수 hashCode() : " + arr.hashCode());

        for (int i = 0; i < arr.length; i++) {
            arr[i] += " 님";
            System.out.println(arr[i] + " ");
        }
    }

    // 리턴 활용
    public static String[] getArr(){
        String[] lunch = new String[] {"순두부", "연어포케", "떡만두국"};

        System.out.println("getArr()의 배열 hashCode() : " + lunch.hashCode());

        return lunch;
    }
}

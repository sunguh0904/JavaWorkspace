package section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*
        [ 깊은 복사 ]
        깊은 복사는 heap 에 생성된 배열이 가진 값을 또 다른 배열에 복사
        서로 같은 값을 가지고 있지만, heap 영역에 각각 다르게 생성된 배열이므로
        하나의 배열 값을 변경하더라도 다른 배열에 영향을 주지 않는다.

        깊은 복사 문법
        1. for 문을 이용하여 동일한 인덱스의 값 복사
        2. Object 의 clone()을 이용한 복사
        3. System 의 arraycopy()를 이용한 복사
        4. Arrays 의 copyOf()를 이용한 복사
         */

        // 복사본을 수정해도 원본은 영향이 없다

        // 깊은 복사와 얕은 복사의 차이는 값은 같지만 hashCode()가 다르다.

        int[] originArr = new int[]{2,3,5,4};
        // 선언과 동시에 할당 및 초기화
        System.out.println(originArr.hashCode());

        /* for 문을 이용하여 인덱스 값 복사 */
        int[] copyFor = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyFor[i] = originArr[i];
        }
        print("copyFor",copyFor);
        // print 메소드를 호출

        /* Object 의 clone()을 이용한 복사 */
        int[] copyClone = originArr.clone();
        // .clone() : 오브젝트에 클론을 사용하면 깊은 복사가 된다.
        print("copyClone",copyClone);

        /* System 의 arraycopy()를 이용한 복사 */
        int[] copyArraycopy = new int[4];
        /* System.arraycopy(원본배열, 복사를 시작할 인덱스, 복사본배열, 복사를 시작할 인덱스, 복사할 길이) */
        System.arraycopy(originArr, 0, copyArraycopy,0, originArr.length);
        print("copyArraycopy", copyArraycopy);

        /* Arrays 의 copyOf()를 이용한 복사 */
        // 원본배열의 시작 인덱스부터 원하는 길이만큼 복사해서 사용 가능하다.
        int[] copyCopyOf = Arrays.copyOf(originArr,4);
        print("copyCopyOf",copyCopyOf);

        /* 향상된 for 문
        for(자료형 변수명 B : 반복가능한 객체 A) {

        }
        A에 들어있는 값을 변수명 B 로 순서대로 받아온다.
        */

        int[] tempArr = {3, 1, 2, 3};
        for (int value : tempArr) {
            // value 값에 3, 1, 2, 3 이 대입
            copyClone[value] = 5;
            // copyClone[3] = 5;
            // copyClone[1] = 5;
            // copyClone[2] = 5;
            // copyClone[3] = 5;
            print("수정된 copyClone",copyClone);
            print("copyClone 수정 후 originArr", originArr);
        }
    }
    public static void print(String name, int[] arr) {
        // 문자열 이름과 정수형 배열을 사용하겠다
        System.out.println(name + "의 hashCode() : " + arr.hashCode());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

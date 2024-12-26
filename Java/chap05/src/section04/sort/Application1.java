package section04.sort;

public class Application1 {
    public static void main(String[] args) {
        /* 변수의 두 값 변경하기 */
        /* 변수를 변경하는 흐름은 트라이앵글 새로운 변수에 임의로 담아 둘 공간이 필요 */
        int num1 = 10;
        int num2 = 20;
        int temp;
        temp = num1;
        // temp 에 num1 의 값을 옮긴다
        num1 = num2;
        // num1에 값을 num2에 옮긴다.
        num2 = temp;
        // num2에 temp 값을 옮긴다.

        System.out.println(num1 + "/" + num2);

        int[] arr = {2,1,3};
        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

/*
        for (int i = 0; i < arr.length; i++); {
            System.out.println(arr[i] + " ");
        }
*/

    }
}

package section04.sort;

public class Application2 {
    public static void main(String[] args) {
        /*
        순차정렬
        정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
        배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장기초적인 정렬 알고리즘이다
         */

        int[] arr = {2, 5, 4, 6, 1, 3}; // 6
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // 부등호만 반대로 처리하면 내림차순
                if (arr[i] > arr[j]) {
                    // i 는 0번째 / j는 1번째 순서 값 비교 ( 첫 루프 )
                    // i 가 2번째 / j는 3번째 비교 시 i 가 더 크면 밑에 식 진행
                    int temp = arr[i];
                    // temp 에 arr[1] 값을 담다
                    arr[i] = arr[j];
                    // arr[i] 에 arr[j] 값을 담다
                    arr[j] = temp;
                    // arr[i] 에 temp 값을 담다
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

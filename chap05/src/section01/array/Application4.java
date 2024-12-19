package section01.array;

public class Application4 {
    public static void main(String[] args) {
        /*
        카드 뽑기
        1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND 를 저장
        2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 를 저장
        3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다.
        4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다.

        출력예시
        당신이 뽑은 카드는 DIAMOND 9 카드 입니다.
         */

        String[] card1 = new String[]{"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] card2 = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "JACK", "QUEEN", "KING", "ACE"};

        int result1 = (int)(Math.random() * card1.length);
        // 랜덤으로 수를 생성을 하는데 그 범위는 card1 배열에 저장된 length[인덱스] 수 만큼 범위 내에서 랜덤생성,
        // 랜덤 생성된 length[인덱스] 순서 값을 result1 이라는 변수에 저장을 함

        int result2 = (int)(Math.random() * card2.length);

        System.out.println("당신이 뽑은 카드는 " + card1[result1] + " " +  card2[result2] + " 카드 입니다.");
        // card1 에 [result1(index 순서값)]을 넣어주면서 card1 배열에 저장 된 순서의 String 값을 출력
    }
}

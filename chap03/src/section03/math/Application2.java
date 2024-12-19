package section03.math;

public class Application2 {
    public static void main(String[] args) {
        /* 난수의 활용
         * (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소 값
         */

        int random1 = (int)(Math.random() * 10); // 0~9 까지의 난수 발생
        System.out.println(random1);

        int random2 = (int)(Math.random() * 3) + 1; // 1~10까지의 난수 발생
        // *10 은 구하려는 난수의 갯수, +1은 구하려는 난수의 최소 값
        System.out.println(random2);

        int random3 = (int)(Math.random() * 6) + 10; // 10~15까지의 난수
        System.out.println(random3);
    }
}

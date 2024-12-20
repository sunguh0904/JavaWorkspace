package section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* [ Queue ]
        Queue 는 선형 메모리 공간에 데이터를 저장하는
        선입선출(FIFO First Input First Out) 방식의 자료 구조이다.
        Queue 인터페이스를 상속받는 하위 인터페이스들은
        Deque, BlockingQueue, TransferQueue 등 다양하지만
        대부분의 Queue 는 LinkedList 를 이용한다.
         */

         // Queue<String> queue = new Queue<String>();
        // Queue 자체로는 인터페이스 이ㅣ 때문에 인스턴스 생성이 불가능하다.

        Queue<String> queue = new LinkedList<>();
        // gpt 설명 필요

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");
        // queue 는 offer 로 배열에 값을 넣을 수 있다.

        System.out.println(queue);

        /* peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환한다.
        poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거한다. */

        System.out.println("Queue.peek() : " + queue.peek());
        System.out.println("Queue.peek() : " + queue.peek());
        // 가장 앞에 있는 "first" 가 나옴, 두 번을 썼다고 해서 다른 값이 나오지는 않는다.
        // 값이 사라지는 건 아니기 때문에
        System.out.println(queue);

        System.out.println("Queue.poll() : " + queue.poll());
        // 가장 앞에 있는 "first" 를 반환 후 제거한다.
        System.out.println("Queue.poll() : " + queue.poll());
        // 두 번째 poll 을 사용하면 "first" 가 사라진 후여서 "second" 가 나온다.
        System.out.println(queue);
    }
}

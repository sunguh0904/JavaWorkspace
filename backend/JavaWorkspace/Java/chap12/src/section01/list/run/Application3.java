package section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /* [ LinkedList ]
        ArrayList 가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
        내부는 이중 연결리스트로 구현되어 있다.

        단일 연결 리스트
        저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로 연결하여
        구성하며, 마치 연결된 리스트 형태인 것 처럼 만든 자료구조이다.
        요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
        요소의 저장과 삭제가 빈번히 일어나는 경우 ArrayList 보다 성능면에서 우수하다.
        하지만 단일 연결 리스트는 다음 요소만 링크하기 때문에 이전 요소로 접근하기가 어렵다.
        이를 보완하고자 만든 것이 이중 연결 리스트이다.

        이중 연결 리스트
        단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여
        이전 요소로 접근하기 쉽게 고안된 자료구조이다
         */

        List<String> linkedList = new LinkedList<>();
        // List 타입을 String 타입으로 변환
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(" linkedList 의 size() : " + linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        linkedList.remove(2);
        for (String s : linkedList) {
            System.out.println(s);
            // 인덱스 두 번째 순서를 지우겠다
        }

        linkedList.set(0, "pineapple");
        System.out.println(linkedList);
        // 인덱스 0번째 순서를 "pineapple" 로 변경하겠다.

        System.out.println(linkedList.isEmpty());
        // 비어있으면 true, 비어있지 않으면 false 를 반환

        linkedList.clear();
        // List 의 모든 값을 지운다.
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList);
        // 모두 지워 졌다.
    }
}

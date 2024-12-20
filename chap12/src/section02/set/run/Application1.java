package section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {
        /* [ set 인터페이스를 구현한 set 컬레션 클래스의 특징 ]
        1. 요소의 저장 순서를 유지하지 않는다.
        2. 같은 요소의 중복 저장을 허용하지 않는다.

        [ HashSet 클래스 ]
        Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        JDK 1.2 부터 제공되고 있으며, 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다. */

        HashSet<String> hashSet = new HashSet<>();
/*
        Set hashSet2 = new HashSet();
        Collections hashSet3 = new HashSet();
*/

        hashSet.add("java");
        hashSet.add("oracle");
        hashSet.add("jdbc");
        hashSet.add("html");
        hashSet.add("css");

        System.out.println("hashSet : " + hashSet);
        // 순서를 유지하지 않는다.

        hashSet.add("java");
        System.out.println("hashSet : " + hashSet);
        // 중복 저장을 허용하지 않는다.
        System.out.println("haseSet.size() : " + hashSet.size());
        System.out.println("hashSet.contains() : " + hashSet.contains("oracle"));
        // contains : 입력한 값이 저장된 요소에 있는지 확인, 있으면 true, 없으면 false를 반환

        Object[] arr = hashSet.toArray();
        // toArray() : hashSet 에 저장된 모든 요소를 포함하는 새로운 'Object' 타입의 배열 반환
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        /* iterator() : Collection 인터페이스의 메소드로, Collection 에 저장된 요소들을
        순차적으로 접근하는데 사용되는 Iterator 를 반환한다. */
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            // 다음에 반환할 요소가 있다면 실행
            System.out.println(iterator.next());
            // 반환할 요소를 출력
        }
        hashSet.clear();
        System.out.println("haseSet.imEmpty() : " + hashSet.isEmpty());
        // isEmpty() : 리스트가 비어 있는지 여부를 확인, 비어있으면 true, 아니면 false 를 반환
    }
}

package section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* [ 컬렉션 프레임워크(Collection Framework) ]
        여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        표준화된 방법을 제공하는 클래스들의 집합을 의미
        즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스

        Collection Framework 는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해 놓았다
        1. List 인터페이스
        2. Set 인터페이스
        3. Map 인터페이스

        List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
        하지만 Map 은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.

        [ List 인터페이스 ]
        - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
        - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.

        [ Set 인터페이스 ]
        - 순서가 없는 데이터의 집합으로 데이터의 중복 저장을 허용하지 않는다.
        - HashSet, TreeSet 등이 있다.

        [ Map 인터페이스 ]
        - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
        - key 를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key 를 허용하지 않는다.
        - value 는 중복된 값을 저장할 수 없다.
        - HashMap, TreeMap, HashTable, Properties 등이 있다. */

        /* [ ArrayList ]
        배열의 단점을 보완하기 위해 만들어졌다.
        배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
        ArrayList 는 저러한 배여의 단점을 보온하고자 크기 변경*새로운 더 큰 배열 만들고 옮기기),
        요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
        자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
         */

        ArrayList arrayList = new ArrayList();
        // ArrayList 는 인스턴스를 생성하게 되면 내부적으로 10칸 짜리 배열을 생성해서 관리한다.

        List list = new ArrayList();
        Collection collection = new ArrayList();
        arrayList.add("apple");
        arrayList.add(123);w
        arrayList.add(12.3);
        arrayList.add(new Date());
        System.out.println("arrayList : " + arrayList);
        // add 로 인덱스 순서로 값을 넣을 수 있다.

        System.out.println("arrayList : " + arrayList.size());
        // .size() 로 크기를 조회할 수 있다.

        for (int i = 0; i < arrayList.size(); i++) {
            // length 대신 길이를 조회할 수 있는 .size() 를 사용한다
            System.out.println(i + " : " + arrayList.get(i));
            // List 에서 값을 가져올 때는 .get() 을 사용한다.
        }

        arrayList.add("apple");
        System.out.println("arrayList : " + arrayList);
        // 나중에 추가해도 뒤에 배열에 추가가 된다.

        arrayList.add(1, "banana");
        System.out.println("arrayList : " + arrayList);
        // 설정한 인덱스 순서 배열에 삽입하여 한 칸씩 뒤로 밀리게 한다.

        arrayList.remove(2);
        System.out.println("arrayList : " + arrayList);
        // .remove() 는 삭제하고 싶은 배열을 인덱스 값을 참조하여 삭제가 가능하다.

        arrayList.set(1, Boolean.valueOf(true));
        // valueOf 는 기본 데이터 타입을 객체 타입을 변환 시켜준다
        // arrayList.set(1, true);
        // autoBoxing 으로 인해 ture 만 적어줘도 자동으로 논리형 타입으로 적용된다.
        // .set() 은 인덱스 순서의 값을 다른 값으로 변경할 때 사용 가능하다.
        System.out.println("arrayList : " + arrayList);

        List<String> stringList = new ArrayList<>();
        // 제네릭 타입을 지정하면 지정한 타입 외 인스턴스는 저장하지 못 한다.
        stringList.add("mango");
        // stringList.add(123);
        stringList.add("banana");
        stringList.add("grape");
        stringList.add("apple");
        System.out.println("stringList : " + stringList);

        Collections.sort(stringList);
        // Collections.sort 는 간편하게 오름차순으로 정렬을 해준다. 알파벳 사전 순으로 정렬이 된다.
        System.out.println("stringList : " + stringList);

        stringList = new LinkedList<>(stringList);
        // LinkedList 는 내림차순의 역할을 해주는데 현재 arrayList 를 LinkedList 타입으로 변경했다.

        /* [ Iterator ]
        Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.

        hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false 를 반환
        next() : 다음 요소를 반환 */

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
        // stringList 를 역순으로 변경
        List<String> decsList = new ArrayList<>();

        while (dIter.hasNext()) {
            decsList.add(dIter.next());
        }
        System.out.println("descList : " + decsList);
    }
}
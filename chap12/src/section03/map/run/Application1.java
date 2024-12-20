package section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* [ Map 인터페이스 특징 ]
        Collection 인터페이스와는 다른 저장 방식을 가진다.
        키(key)와 값(value)을 하나의 쌍으로 저장하는 방식을 사용

        키(key)란?
        값(value)을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        1. 요소의 저장 순서를 유지하지 않는다
        2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값(value)은 저장 가능하다.

        HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다
        HashMap 이 가장 많이 사용된다*/

        HashMap hashMap = new HashMap();

        hashMap.put("one", new Date());
        hashMap.put(12, "red apple");
        hashMap.put(33, 123);
        // autoBoxing 처리 됨 : 12 -> new Integer(12)

        System.out.println("hashMap : " + hashMap);

        hashMap.put(12, "yellow banana");
        System.out.println("hashMap : " + hashMap);
        // 키는 중복 저장 되지 않음(Set 의 특징) : 최근 키(Key)로 오버라이딩됨(덮어씀)

        hashMap.put(11, "yellow banana");
        hashMap.put(9, "yellow banana");
        System.out.println("hashMap : " + hashMap);

        System.out.println("키 9에 대한 객체 : " + hashMap.get(9));

        hashMap.remove(9);
        System.out.println("키 9에 대한 객체 삭제 : " + hashMap);

        System.out.println("hashMap.size() : " + hashMap.size());

        HashMap<String, String> hashMap1 = new HashMap<>();
        // HashMap 의 경우 키(key)와 값(value)이 들어가기 때문에 제네릭에서 두 개의 값을 넣어줘야 한다.

        hashMap1.put("one", "java 8");
        hashMap1.put("two", "mysql");
        hashMap1.put("three", "jdbc");
        hashMap1.put("four", "html5");
        hashMap1.put("five", "css3");

        Iterator<String> keyIter = hashMap1.keySet().iterator();
        // keySet : 키 값을 가져오는 메소드
        while ((keyIter.hasNext())) {
            String key = keyIter.next();
            String value = hashMap1.get(key);
            System.out.println(key + " = " + hashMap1);
        }

        Collection<String> values = hashMap1.values();
        Iterator<String> valueIter = values.iterator();
        // Iterator<String> valueIter = hashMap.values().iterator();
        // 위 두개의 메소드를 합쳐서 코딩    }
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }
        /* Entry : 키 객체와 값 객체를 쌍으로 묶은 것
        Entry 는 java.util.Map 인터페이스의 내부 인터페이스로, Map 안의 키-값 쌍을 나타낸다
        [ entrySet() : Map에 저장된 모든 키-값 쌍(Entry)을 Set 형태로 변환한다
        getKey()와 getValue() 메소드를 제공하며 키와 값을 각각 가져올 수 있다.
        Map.Entry 객체는 하나의 키와 값에 대한 참조를 제공하며
        ,이를 통해 특정 Map 항목의 키 or 값을 가져오거나 설정할 수 있다.
         */
        Iterator<Map.Entry<String, String>> entryIterator = hashMap1.entrySet().iterator();

        // Set<Map.Entry<String, String>> set = hashMap1.entrySet();
        // Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

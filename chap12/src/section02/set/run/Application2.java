package section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        /* [ LinkedHashSet 클래스 ]
        HashSet이 가지는 기능을 모두 가지고 있고
        추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        JDK 1.4 부터 제공하고 있다. */

        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        stringLinkedHashSet.add("java");
        stringLinkedHashSet.add("oracle");
        stringLinkedHashSet.add("jdbc");
        stringLinkedHashSet.add("html");
        stringLinkedHashSet.add("css");

        System.out.println("stringLinkedHashSet : " + stringLinkedHashSet);
        // hashSet과는 다르게 순서를 유지

        TreeSet treeSet = new TreeSet<>(stringLinkedHashSet);
        // TreeSet : 오름차순
        System.out.println("treeSet : " + treeSet);

        Iterator<String> iter = treeSet.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next().toUpperCase());
            // .toUpperCase() : 반환받은 요소를 대문자로 바꿔준다.
        }

        Object[] objects = treeSet.toArray();

        for (Object obj : objects) {
            System.out.println(((String)obj).toUpperCase());
            // String 으로 강제 형변환 해줘야 가능하다
        }
    }
}

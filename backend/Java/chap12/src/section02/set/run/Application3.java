package section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* [ TreeSet 클래스 ]
        TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
        이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
        JDK1.2 부터 제공되고 있으며
        Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬딘 상태를 유지한다는 것이 다른 점이다. */

        TreeSet<String> treeSet = new TreeSet<>();
        Set<String> set = new TreeSet<>();
        // 다형성을 적용

        treeSet.add("java");
        treeSet.add("oracle");
        treeSet.add("jdbc");
        treeSet.add("html");
        treeSet.add("css");

        System.out.println("treeSet : " + treeSet);
        // 오름차순으로 정렬

        /* 로또 번호 발생(TreeSet 특지 이용) */
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("lotto : " + lotto);
    }
}

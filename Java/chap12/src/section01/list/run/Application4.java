package section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* [ Stack ]
        Stack 은 리스트 계열 클래스의 Vector 클래스를 상속 받아 구현 하였다.
        Stack 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        후입선출(LIFO - Last Input First Out) 방식의 자료 구조라 불린다. */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        // push() 를 통해 정수를 대입 하였다.

        System.out.println(integerStack);

        System.out.println(integerStack.search(5));
        // Stack 에서는 순서가 인덱스가 아닌 일반 순서다
        // Stack 은 후입선출 이기 때문에 1번이 먼저 들어가고 나오는 것은 5번이다 .

        /* Stack 에서 값을 꺼내는 메소드
        peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환
        pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거 */

        System.out.println("integerStack.peek() : " + integerStack.peek());
        System.out.println(integerStack);
        // peek()

        System.out.println("integerStack.pop() : " + integerStack.pop());
        // pop 을 리스트 길이만큼 생성을 하게되면 값은 모두 사라진다.
        // 리스트 길이보다 더 pop() 을 사용하면 EmptyStackException 에러가 나온다.
        System.out.println(integerStack);
        // pop()
    }
}

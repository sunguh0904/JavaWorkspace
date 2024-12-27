package section02.string;

public class Application2 {
    public static void main(String[] args) {
        /* [ 문자열 객체를 만드는 방법 ]
        "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리
        new String("문자열") : 매번 새로운 인스턴스를 생성한다. */
        String str1 = "java";
        String str2 = "java";
        // 같은 값이면 Strong pool 저장소에서 새롭게 만드는 것이 아닌 가져다 쓴다
        String str3 = new String("java");
        String str4 = new String("java");
        // 새롭게 만든다

        System.out.println("str1 == str2 : " +(str1 == str2));      // ture
        System.out.println("str1 == str2 : " +(str2 == str3));      // false
        System.out.println("str1 == str2 : " +(str3 == str4));      // false

        System.out.println("srt1의 hashCode : " + str1.hashCode());
        System.out.println("srt2의 hashCode : " + str2.hashCode());
        System.out.println("srt3의 hashCode : " + str3.hashCode());
        System.out.println("srt4의 hashCode : " + str4.hashCode());
        // 동일한 문자열은 동일한 hashCode 값을 반환하도록 재정의 되어 있다.

        /* 문자열은 불변이라는 특징을 가진다
        기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아니고 새로운 문자열을 할당한다. */
        str2 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2));

        /* [ equals() ]
        String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열 값을 비교하여
        동일한 값을 가지는 경우 true, 다른 값인 경우 false 를 반환하도록 Object 의
        equals() 메소드를 재정희 해 두었다.
        따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 비교하기 위해 == 연산 대신
        equals() 메소드를 사용해야 한다. */
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str1.equals(str4) : " + str1.equals(str4));

        /* 참고로 new java.util.Scanner(System.in).nextLine(); 을 이용해 문자열을 입력받는 경우
        subString 으로 잘라내기 해서 새로운 문자열을 생성 후 반환하기 때문에
        new String()으로 인스턴스를 생성한 것과 동일한 것으로 볼 수 있다.
        따라서 Scanner 로 입력받은 문자열을 비교할 때에는 equals()를 써야한다.
        구분하기 힘들면 그냥 문자열은 equals()로 비교하는 것이 가장 좋은 방법 */
    }
}

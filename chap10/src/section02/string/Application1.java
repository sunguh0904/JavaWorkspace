package section02.string;

public class Application1 {
    public static void main(String[] args) {
        /* [ charAt() ]
        해당 문자열의 특정 인덱스에 해당하는 문자를 반환
        인덱스를 벗어난 정수를 인자로 전달하는 경우 IndexOutOfBoundsException 이 발생 */
        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        /* [ compareTo() ]
        인자로 전달된 문자열과 사전 순으로 비교를 하여, 두 문자열이 같다면 0을 반환,
        인자로 전달된 문자열보다 작으면 음수, 크면 양수를 반환
        단, 이 메소드는 대소문자를 구분하여 비교 */
        String str2 = "java";
        String str3 = "java";
        String str4 = "Java";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));  // 0 == 값이 같다
        System.out.println("compareTo() : " + (str2.compareTo(str4)));  // 32 만큼의 차이
        System.out.println("compareTo() : " + (str4.compareTo(str2)));  // -32 만큼의 차이
        System.out.println("compareTo() : " + (str2.compareTo(str5)));  // -5 만큼의 차이
        System.out.println("compareTo() : " + (str5.compareTo(str2)));  // 5 만큼의 차이

        /* [ compareToIgnoreCase() ]
        대소문자를 구분하지 않고 비교 */
        System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4)));

        /* [ concat() }
        문자열에 인자로 전달된 문자열을 합쳐지기해서 새로운 문자열을 반환한다.
        원본 문자열에는 영향을 주지 않는다. */
        System.out.println("concat() : " + (str2.concat(str5)));    // javaoracle
        System.out.println("str2 : " + str2);

        /* [ indexOf() ]
        문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
        단, 일치하는 문자가 없는 경우 -1을 반환 */
        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));   // 인덱스 순서로 1
        System.out.println("indexOf('a') : " + indexOf.indexOf('b'));   // 인덱스 순서로 -1

        /* [ trim() ]
        문자열의 앞 뒤에 공배을 제거한 문자열을 반환 */
        String trimStr = "     java        ";
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trimStr : #" + trimStr.trim() + "#");       // 공백 제거

        /* [ toLowerCase() ]
        모든 문자를 소문자로 변환 */
        String caseStr1 = "JavaOracle";
        System.out.println("toLoweCase : " + caseStr1.toLowerCase());

        /* [ toUpperCase() ]
        모든 문자를 대문자로 변환 */
        String caseStr2 = "javaoracle";
        System.out.println("toUpperCase : " + caseStr2.toUpperCase());

        /* [ substring() ]
        문자열의 일부분을 잘라내어 새로운 문자열을 반환 */
        String javaMySql = "javaMySql";
        System.out.println("substring(3, 6) : " + javaMySql.substring(3, 6));
        // 3번째 인덱스 부터 (6번째 -1) 까지
        System.out.println("substring(3) : " + javaMySql.substring(3));
        // 3번째 인덱스 부터 끝가지

        /* [ replace() ]
        문자열에서 변경할 문자열을 바뀔 문자열을 반환 */
        System.out.println("replace() : " + javaMySql.replace("java", "python"));
        // java 를 python 으로 바꿔주겠다

        /* [ length() ]
        문자열의 길이를 정수형으로 반환 */
        System.out.println("length() " + javaMySql.length());
        System.out.println("빈 문자열의 길이" + ("".length()));

        /* [ isEmpty() ]
        문자열의 길이가 0이면 true, 아니면 false 를 반환, 길이가 0인 문자열은 null 과는 다르다 */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abc".isEmpty());
    }
}

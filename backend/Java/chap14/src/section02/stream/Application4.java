package section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* [ FileWriter ]
        프로그램의 데이터를 내보내기 위한 용도의 스트림으로,
        1글자 단위로 데이터를 처리한다. */

        FileWriter fw = null;
        // 버퍼는 임시 공간
        try {
            fw = new FileWriter("src/section02/stream/testWriter");

            fw.write(97);

            /* 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다 */
            fw.write('A');
            fw.write(System.lineSeparator());

            fw.write(new char[] {'a', 'p', 'p', 'l', 'e', '\n'});

            fw.write("애플");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* [ FileReadr ]
        FileInputStream과 사용하는 방법이 거의 동일하다.
        단, byte 단위가 아닌 character 단위로 읽어들이는 부분의 차이
        따라서 2바이트던 3바이트던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다. */

        FileReader fr = null;
        try {
            fr = new FileReader("src/section02/stream/testReader");
            int value;
/*
            while ((value = fr.read()) != -1) {
                // read : 값이 있을 때는 순차적으로 읽어오고 더 이상 값이 없을 때 -1 을 반환한다.
                // -1이 아닐 동안 실행
                System.out.println((char) value);
            }
*/

            char[] carr = new char[(int) new File("src/section02/stream/testReader").length()];
            fr.read(carr);

            for (int i = 0; i < carr.length; i++) {
                System.out.print(carr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                // fr이 null(비어있지)이 아니라면
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

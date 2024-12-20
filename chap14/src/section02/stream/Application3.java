package section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* [ FileOutputStream ]
        프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
        1바이트 단위로 데이터를 처리한다 */

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("src/section02/stream/testOutputStream");
            // 파일 자동 생성
            fout.write(97);
            /* 10 : 개행문자 */
            byte[] bar = new byte[] {98, 99, 100, 101, 102, 10};
            fout.write(bar);
            fout.write(bar, 1,3);
            // bar에서 1의 인덱스 순번부터 bar의 3의 길이만큼
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

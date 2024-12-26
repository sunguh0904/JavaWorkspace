package section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        /* [ File 클래스 ]
        JDK1.0부터 지원하는 API로 파일 처리를 수행하는 대표적 클래스
        대상 파일에 대한 정보로 인스턴스를 생성하고
        파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다. */

        File fIle = new File("src/com/ohgiraffers/section01/file/test.txt");
        // 파일 생성을 성공했는지 실패했는지 확인하기

        try {
            boolean creatSuccess = fIle.createNewFile();
            System.out.println("creatSuccess : " + creatSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 : " + fIle.length() + "byte");
        // 텍스트 파일의 byte 크기

        System.out.println("파일의 경로 : " + fIle.getPath());
        // 파일의 경로

        System.out.println("현재 파일의 상위 경로 :" + fIle.getParent());
        // 현재 파일의 상위 경로

        System.out.println("파일의 절대 경로 : " + fIle.getAbsolutePath());
        // 파일의 절대 경로 ( 최상의 위치부터 경로를 보여준다. )

        boolean deleteSuccess = fIle.delete();
        // 파일 삭제
        System.out.println("deleteSuccess : " + deleteSuccess);
    }
}

package section03.filterStream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /* [ 형변환 보조 스트림 ]
        기본 스트림이 byte기반 스트림이고, 보조 스트림이 char 기반 스트림인 경우 사용한다.

        [ 표준 스트림(바이트 기반 스트림]
        System 클래스의 필드 in, out, err가 대상 데이터에 스트림을 의미한다.
        System.in (InputStream) : 콘솔로부터 데이터를 입력받는다.
        System.out (PrintStream) : 콘솔로 데이터를 출력한다.
        System.err (PrintStream) : 콘솔로 데이터를 출력한다(에러)
        자주 사용되는 자원에 대해 미리 스트림을 생성해 두었기 때문에 개발자가 별도로 스트림을 생성하지 않아도 된다.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열 입력 : ");

        try {
            String value = br.readLine();
            System.out.println("value : " + value);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("java mysql jdvc");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

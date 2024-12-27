package section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /* [ Properties ]
        HashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조
        설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용된다. */

        Properties prop = new Properties();

        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdvc:mysql://localhost/menudb");
        prop.setProperty("user", "ohgiraffers");
        prop.setProperty("password", "ohgiraffers");
        // 저장 순서를 유지하지 않는다.

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            // 예외처리를 강제로 진행했다.
            prop2.load(new FileInputStream("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
            prop2.list((System.out));

            System.out.println(prop.getProperty("driver"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("user"));
            System.out.println(prop.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

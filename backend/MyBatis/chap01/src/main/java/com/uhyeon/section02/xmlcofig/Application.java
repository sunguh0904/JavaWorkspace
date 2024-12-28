package com.uhyeon.section02.xmlcofig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Application {
    public static void main(String[] args) {

        String resource = "mybatis-config.xml";

        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 설정된 파일을 가져옴

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession(false);

            java.util.Date date = session.selectOne("mapper.selectSysdate");

            System.out.println("date = " + date);
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

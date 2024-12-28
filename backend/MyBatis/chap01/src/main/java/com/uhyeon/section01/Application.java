package com.uhyeon.section01;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Application {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static String URL = "jdbc:mysql://localhost/menudb";

    private static String USER = "uhyeon";

    private static String PASSWORD = "uhyeon";

    /* DB 접속에 관한 설정
    JdbcTransactionFactory: 수동 커밋
    ManagedTransactionFactory: 자동 커밋

    PooledDataSource: ConnectionPool 사용
    UnpooledDataSource: connectionPool 미사용 */
    public static void main(String[] args) {
        Environment environment = new Environment("dev", new JdbcTransactionFactory(),
                new PooledDataSource(DRIVER, URL, USER, PASSWORD));
        // Environment: 환경 정보 이름(구분하기 위한 ID값)
        // 기본 생성자를 제공하지 않으므로, 필수적으로 값을 넣어줘야한다.id: (dev)
        // JdbcTransactionFactory: 커밋을 수동으로 하겠다. (트랜잭션 매니저 종류)
        // PooledDataSource: 인자로 driver, url, user, password를 주어야한다. ( 커넥션풀 사용 유무 결정)

        Configuration configuration = new Configuration(environment);

        /* 설정 객체에 Mapper 등록 (어디에 쿼리를 작성했다 를 등록 Mapper에 대한 메타정보 전달) */
        configuration.addMapper(Mapper.class);

        /* SqlSessionFactory: SqlSession 객체를 생성하기 위한 팩토리 역할의 인터페이스
        sqlSessionFactoryBuilder: SqlSessionFactory 인터페이스 타입의 하위 구현 객체를 생성하기 위한 빌드 역할
        build(): 설정에 대한 정보를 담고 있는 Configuration 타입의 객체 혹은 외부 설정파일과 연결된
                Stream을 매개변수로 전달하면 SqlSessionFactory 인터페이스 타입의 객체를 반환하는 메소드 */
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        // openSession(): sqlSession 인터페이스 타입의 객체를 반환하는 메소드로 boolean 타입을 인자로 전달
        // openSession(false): auto commit에 대한 옵션, 수동으로 하겠다.

        /* getMapper(): Configuration에 등록된 매퍼를 동일 타입에 대해 반환하는 메소드 */
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        /* Mapper 인터페이스에 작성된 메소드를 호출하여 쿼리 실행 */
        java.util.Date date = mapper.selectSysdate();
        System.out.println("date = " + date);

        sqlSession.close();
        // 마지막은 닫아야 한다.

        // 자바로 연결하는 방법
    }
}

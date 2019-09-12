import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestUser {
    SqlSession sqlSession = null;

    @Before
    public void before(){
        InputStream inputStream = TestUser.class.getClassLoader().getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void after(){
        sqlSession.close();;

    }

    @Test
    public void test(){
        /*Object o = sqlSession.selectOne("cn.kgc.mybatis.mapper.UserMapper.getUserCount");
        System.out.println(o);*/
        List<Object> objects = sqlSession.selectList("cn.kgc.mybatis.mapper.ProviderMapper.getList");
        System.out.println(objects);
    }

}

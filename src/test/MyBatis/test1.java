package MyBatis;

import com.dao.CustomerMapper;
import com.domain.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class test1 {
    @Test
    public void test() throws Exception{
//1.创建 SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builer = new SqlSessionFactoryBuilder();
        //加载 sqlMapConfig.xml 文件
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
//2.创建 sqlSessionFactory
        SqlSessionFactory factory = builer.build(is);
//3.打开 SqlSession
        SqlSession sqlSession = factory.openSession();
///4.获取 Mapper 接口的对象
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
//5.操作
        Customer customer = new Customer();
        customer.setName("小张");
        customer.setGender("男");
        customer.setTelephone("020-3333333");
        customer.setAddress("广州天河城广场");
        customerMapper.saveCustomer(customer);
//6.提交事务
sqlSession.commit();
//7.关闭资源
        sqlSession.close();
    }
}

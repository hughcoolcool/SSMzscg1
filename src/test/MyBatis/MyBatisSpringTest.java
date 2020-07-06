package MyBatis;

import com.domain.Customer;
import com.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringTest {
    @Test
    public void test(){
        //load the spring xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        //get objects bean
        CustomerService customerService =(CustomerService) ac.getBean("customerService");

        //call the method
        Customer customer = new Customer();
        customer.setName("mark");
        customer.setGender("男");
        customer.setTelephone("020-1111111");
        customer.setAddress("小东北");
        customerService.saveCustomer(customer);



    }

}

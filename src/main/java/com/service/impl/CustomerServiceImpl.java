package com.service.impl;

import com.dao.CustomerMapper;
import com.domain.Customer;
import com.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    //注入 Mapper 对象
    @Resource
    private CustomerMapper customerMapper;


    public void saveCustomer(Customer customer) {

       customerMapper.saveCustomer(customer);
    }


    public List<Customer> findAll() {

        return customerMapper.findAl();
    }

    @Override
    public void save(Customer customer) {
        //判断是添加还是修改
        if(customer.getId()!=null){
            //修改
            customerMapper.update(customer);

        }else {
            customerMapper.save(customer);
        }
    }

    @Override
    public Customer findById(Integer id) {
        return customerMapper.findById(id);
    }

    @Override
    public void delete(Integer[] id) {
        customerMapper.delete(id);
    }
}

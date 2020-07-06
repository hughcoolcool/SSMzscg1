package com.dao;

import com.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    //add a customer
    void saveCustomer(Customer customer);

    /**
     * 查询所有数据 */
    List<Customer> findAl();


    void save(Customer customer);

/**
 * 根据 id 查询对象
 * * @param id * @return */

   Customer findById(Integer id);

    void update(Customer customer);

    /**
     * 删除数据
     * @param id
     */
     void delete(Integer[] id);
}

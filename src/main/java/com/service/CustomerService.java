package com.service;

import com.domain.Customer;

import java.util.List;


public interface CustomerService {

    void saveCustomer(Customer customer);


    /**
     * 查询所有数据
     */
   List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Integer id);

    void delete(Integer[] id);
}

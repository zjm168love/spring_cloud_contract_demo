package com.importsource.springcloud.customer;

import com.importsource.springcloud.common.Customer;
import org.springframework.stereotype.Service;

/**
 * @Auther: zjm
 * @Date: 2019-07-17
 * @Description:
 */
@Service
public class CustomersService {
    public Customer getCustomer() {
        return new Customer();
    }
}

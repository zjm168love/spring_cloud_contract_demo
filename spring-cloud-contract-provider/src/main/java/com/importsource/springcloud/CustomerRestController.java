package com.importsource.springcloud;

import com.importsource.springcloud.common.Customer;
import com.importsource.springcloud.common.Page;
import com.importsource.springcloud.customer.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhuofan
 */
@RestController
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomersService customersService;

    @RequestMapping(path = "/api/customers")
    public Page getCustomers() {
        Page page = new Page();
        page.setData(customerRepository.findAll());
        return page;
    }

    @RequestMapping(path = "/api/one")
    public Customer getOne() {

        return customersService.getCustomer();
    }

}

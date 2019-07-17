package com.importsource.springcloud;

import com.importsource.springcloud.common.Customer;
import com.importsource.springcloud.customer.CustomersService;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringCloudContractApplication.class)
public class SpringCloudContractApplicationTests {

    @Autowired
    private CustomerRestController customerRestController;
    @MockBean
    private CustomerRepository customerRepository;

    @MockBean
    private CustomersService customersService;

    @Before
    public void before() {

        Mockito.when(customerRepository.findAll()).thenReturn(
                Arrays.asList(new Customer(1L, "sam"), new Customer(2L, "andy")));

//        RestAssuredMockMvc.standaloneSetup(this.customerRestController);


        Mockito.when(customersService.getCustomer()).thenReturn(
                new Customer(1L, "Chelsey"));


        StandaloneMockMvcBuilder standaloneMockMvcBuilder = MockMvcBuilders.standaloneSetup(customerRestController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }


}



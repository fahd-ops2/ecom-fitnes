package io.fitness.ecom.service.impl;

import io.fitness.ecom.dto.CustomerDto;
import io.fitness.ecom.mapper.CustomerMapper;
import io.fitness.ecom.repository.CustomerRepository;
import io.fitness.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Page<CustomerDto> getAllCustomers(Pageable pageable) {
        List<CustomerDto> customers = CustomerMapper
                .INSTANCE
                .customersToCustomerDtos(customerRepository.findAll(pageable).getContent());

        return new PageImpl<>(customers, pageable, customers.size());
    }

}

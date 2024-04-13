package io.fitness.ecom.service;

import io.fitness.ecom.dto.CustomerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    Page<CustomerDto> getAllCustomers(Pageable pageable);
}

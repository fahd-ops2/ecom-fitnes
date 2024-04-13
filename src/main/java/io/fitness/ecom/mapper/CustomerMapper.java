package io.fitness.ecom.mapper;

import io.fitness.ecom.dto.CustomerDto;
import io.fitness.ecom.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    public CustomerDto customerToCustomerDto(Customer customer);

    public Customer customerDtoToCustomer(CustomerDto customerDto);
    
    public List<CustomerDto> customersToCustomerDtos(List<Customer> customers);

    public List<Customer> customerDtosToCustomers(List<CustomerDto> customerDtos);
}

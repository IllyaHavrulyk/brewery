package com.havrulyk.brewery.web.mappers;

import com.havrulyk.brewery.web.domain.Customer;
import com.havrulyk.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}

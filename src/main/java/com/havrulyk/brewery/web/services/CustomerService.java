package com.havrulyk.brewery.web.services;

import com.havrulyk.brewery.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
  CustomerDto getCustomerById(UUID id);

  CustomerDto saveNewCustomer(CustomerDto customerDto);

  void updateCustomer(UUID customerId, CustomerDto customerDto);

  void deleteById(UUID customerId);
}

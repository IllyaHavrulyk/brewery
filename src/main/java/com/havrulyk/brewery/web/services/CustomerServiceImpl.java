package com.havrulyk.brewery.web.services;

import com.havrulyk.brewery.web.model.CustomerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class CustomerServiceImpl implements CustomerService{

  @Override
  public CustomerDto getCustomerById(UUID id) {
    return CustomerDto.builder()
        .name("Daun")
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public CustomerDto saveNewCustomer(CustomerDto customerDto) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    //todo impl
    log.debug("Updating....");
  }

  @Override
  public void deleteById(UUID customerId) {
    log.debug("Deleting.... ");
  }
}

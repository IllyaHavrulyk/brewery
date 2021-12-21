package com.havrulyk.brewery.web.services;

import com.havrulyk.brewery.web.model.BeerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

  @Override
  public BeerDto getBeerById(UUID id) {
    return BeerDto.builder()
        .beerName("beerName1")
        .beerStyle("beerStyle1")
        .upc(1234L)
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    // todo impl - would add a real impl to update beer
  }

  @Override
  public void deleteById(UUID beerId) {
    log.debug("Deleting a beer...");
  }


}

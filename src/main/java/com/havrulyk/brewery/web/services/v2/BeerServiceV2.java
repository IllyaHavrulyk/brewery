package com.havrulyk.brewery.web.services.v2;

public interface BeerServiceV2 {
  BeerDtoV2 getBeerById(UUID beerId);

  BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

  void updateBeer(UUID beerId, BeerDtoV2 beerDto);

  void deleteById(UUID beerId);
}

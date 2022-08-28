package com.havrulyk.brewery.web.mappers;

import com.havrulyk.brewery.web.domain.Beer;
import com.havrulyk.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}

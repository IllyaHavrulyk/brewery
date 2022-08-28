package com.havrulyk.brewery.web.model.v2;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
  @Null
  private UUID id;
  @NotBlank
  private String beerName;
  @NotBlank
  private BeerStyle beerStyle;
  @Positive
  private Long upc;
}
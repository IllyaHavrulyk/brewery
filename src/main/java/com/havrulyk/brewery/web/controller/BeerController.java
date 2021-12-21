package com.havrulyk.brewery.web.controller;

import com.havrulyk.brewery.web.model.BeerDto;
import com.havrulyk.brewery.web.services.BeerService;
import java.util.UUID;
import javax.xml.ws.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
  private final BeerService beerService;

  public BeerController(BeerService beerService) {
    this.beerService = beerService;
  }

  @GetMapping(value = "/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId){
    return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
  }

  @PostMapping// POST - create new beer
  public ResponseEntity handlePost(@RequestBody BeerDto beerDto){
    BeerDto savedDto = beerService.saveNewBeer(beerDto);
    HttpHeaders headers = new HttpHeaders();
    //TODO: add hostname to url
    headers.add("Location", "/api/v1/beer" + savedDto.getId().toString());
    return new ResponseEntity(headers, HttpStatus.CREATED);
  }

  @PutMapping(value = "/{beerId}")
  public ResponseEntity handleUpdate(@PathVariable("beerId")UUID beerId, @RequestBody BeerDto beerDto){
    beerService.updateBeer(beerId, beerDto);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping({"/{beerId}"})
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteBeer(@PathVariable("beerId") UUID beerId){
    beerService.deleteById(beerId);
  }
}

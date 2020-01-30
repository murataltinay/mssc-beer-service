package guru.springframework.msscbeerservice.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    public Beer BeerDtoToBeer(BeerDto beerDto);
    public BeerDto BeerToBeerDto(Beer beer);
}

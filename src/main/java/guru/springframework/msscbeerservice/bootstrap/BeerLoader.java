package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC="0215400003121";
    public static final String BEER_2_UPC="0103000000004";
    public static final String BEER_3_UPC="0215540000654";

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200).minOnHand(12)
                    .price(new BigDecimal("12.95"))
                    .upc(BEER_1_UPC)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE ALE")
                    .quantityToBrew(200).minOnHand(12)
                    .price(new BigDecimal("12.95"))
                    .upc(BEER_2_UPC)
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Kozel")
                    .beerStyle("PALE ALE")
                    .quantityToBrew(200).minOnHand(12)
                    .price(new BigDecimal("12.95"))
                    .upc(BEER_3_UPC)
                    .build());


        }

    }
}

package com.awesomebank.card.configs;

import com.awesomebank.card.entities.Card;
import com.awesomebank.card.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
@RequiredArgsConstructor
public class StartupConfig implements ApplicationRunner {
    private final CardRepository cardRepository;

    @Override
    public void run(ApplicationArguments args) {
        if (cardRepository.findAll().isEmpty()) {
            cardRepository.saveAll(Arrays.asList(
                    Card.builder().type("MASTER").build(),
                    Card.builder().type("VISA").build(),
                    Card.builder().type("RUPAY").build()
            ));
        }
    }
}

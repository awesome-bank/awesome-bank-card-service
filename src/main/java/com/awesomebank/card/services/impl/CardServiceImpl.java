package com.awesomebank.card.services.impl;

import com.awesomebank.card.entities.Card;
import com.awesomebank.card.exceptions.CardNotFoundException;
import com.awesomebank.card.repositories.CardRepository;
import com.awesomebank.card.services.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card getCardsById(Long id) {
        return cardRepository.findById(id).orElseThrow(()-> new CardNotFoundException(String.format("Could not find card with id: %s", id)));
    }
}

package com.awesomebank.card.services;

import com.awesomebank.card.entities.Card;

import java.util.List;

public interface CardService {
    List<Card> getCards();

    Card getCardsById(Long id);
}

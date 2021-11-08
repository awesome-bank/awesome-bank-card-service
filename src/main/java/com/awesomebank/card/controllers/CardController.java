package com.awesomebank.card.controllers;

import com.awesomebank.card.entities.Card;
import com.awesomebank.card.services.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/cards")
public class CardController {
    private final CardService cardService;

    @GetMapping
    public ResponseEntity<List<Card>> getCardList() {
        return ResponseEntity.ok(cardService.getCards());
    }

    @GetMapping("{id}")
    public ResponseEntity<Card> getCardById(@PathVariable Long id) {
        return ResponseEntity.ok(cardService.getCardsById(id));
    }

}

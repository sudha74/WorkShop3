package com;

public class DeckOfCardsMain {

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.initializeCards();
        cards.distributeCards();
        cards.displayCards();
    }

}
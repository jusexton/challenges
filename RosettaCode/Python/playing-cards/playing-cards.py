from enum import Enum
from collections import deque
from random import shuffle


class CardSuit(Enum):
    CLUBS = 1
    SPADES = 2
    HEARTS = 3
    DIAMONDS = 4


class Card:
    def __init__(self, suit, value):
        if not Card._value_check(value):
            raise ValueError('value must be between 1 and 13')

        self.suit = suit
        self.value = value

    @staticmethod
    def _value_check(value):
        return 1 <= value <= 13


class CardDeck:
    """
    Deque wrapper.
    Represents a deck of cards.
    """

    def __init__(self, shuffle_on_build=False):
        self.cards = deque(maxlen=52)
        self._build_deck()

        if shuffle_on_build:
            self.shuffle()

    def deal_card(self):
        return self.cards.pop()

    def shuffle(self):
        shuffle(self.cards)

    def _build_deck(self):
        self.cards.clear()
        for suit in CardSuit:
            for value in range(1, 14):
                self.cards.append(Card(suit, value))


if __name__ == '__main__':
    deck = CardDeck(shuffle_on_build=False)
    for card in deck.cards:
        print('{0} - {1}'.format(card.suit, card.value))

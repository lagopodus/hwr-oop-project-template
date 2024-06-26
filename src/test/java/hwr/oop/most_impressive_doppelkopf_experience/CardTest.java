package hwr.oop.most_impressive_doppelkopf_experience;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
  @Test
  void testCardSymbols() {
    Card card = new Card(CardSymbols.TEN, CardColours.TRUMP, 12, "D10", 10);
    assertSoftly(
        softly -> {
          assertEquals(CardSymbols.TEN, card.getSymbol());
          assertEquals(CardColours.TRUMP, card.getColour());
          assertEquals(12, card.getValue());
          assertEquals("D10", card.getName());
          assertEquals(10, card.getWorth());
        });
  }

  @Test
  void testGetCardStack() {
    CardStack cardStack = new CardStack();
    List<Card> cards = cardStack.getCardStack();
    assertNotNull(cards);
    assertFalse(cards.isEmpty());
  }

  @Test
  void testCardSymbols2() {
    Card card = new Card(CardSymbols.JACK, CardColours.TRUMP, 14, "DJ", 2);
    assertSoftly(
        softly -> {
          assertEquals(CardSymbols.JACK, card.getSymbol());
          assertEquals(CardColours.TRUMP, card.getColour());
          assertEquals(14, card.getValue());
          assertEquals("DJ", card.getName());
          assertEquals(2, card.getWorth());
        });
  }

  @Test
  void testCardSymbols3() {
    Card card = new Card(CardSymbols.ACE, CardColours.HEARTS, 4, "HA", 11);
    assertSoftly(
        softly -> {
          assertEquals(CardSymbols.ACE, card.getSymbol());
          assertEquals(CardColours.HEARTS, card.getColour());
          assertEquals(4, card.getValue());
          assertEquals("HA", card.getName());
          assertEquals(11, card.getWorth());
        });
  }

  @Test
  void testToString() {
    Card card = new Card(CardSymbols.ACE, CardColours.HEARTS, 4, "HA", 11);
    var toString = card.toString();
    assertThat(toString).contains("ACE", "HEARTS");
  }
}

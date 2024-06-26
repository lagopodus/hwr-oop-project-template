package hwr.oop.most_impressive_doppelkopf_experience;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stich implements Serializable {
  @Serial private static final long serialVersionUID = 1L;

  public void setDiscardCards(List<Card> discardCards) {
    this.discardCards = discardCards;
  }

  public List<Card> getDiscardCards() {
    return discardCards;
  }

  private List<Card> discardCards = new ArrayList<>();

  public void discardCard(Card card) {
    discardCards.add(card);
  }
}

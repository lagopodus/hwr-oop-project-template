package hwr.oop;

import hwr.oop.enums.CardColours;
import hwr.oop.enums.CardSymbols;

import java.util.ArrayList;
import java.util.List;

public class CardGenerator {
    Card d9 = new Card(CardSymbols.NINE, CardColours.Trump, 10, "D9", 0);
    Card d10 = new Card(CardSymbols.TEN, CardColours.Trump, 12, "D10", 10);
    Card dj = new Card(CardSymbols.JACK, CardColours.Trump, 14, "DJ", 2);
    Card dq = new Card(CardSymbols.QUEEN, CardColours.Trump, 18, "DQ", 3);
    Card dk = new Card(CardSymbols.KING, CardColours.Trump, 13, "DK", 4);
    Card da = new Card(CardSymbols.ACE, CardColours.Trump, 11, "DA", 11);
    Card h9 = new Card(CardSymbols.NINE, CardColours.Hearts, 0, "H9", 0);
    Card h10 = new Card(CardSymbols.TEN, CardColours.Trump, 100, "H10", 10);
    Card hj = new Card(CardSymbols.JACK, CardColours.Trump, 15, "HJ", 2);
    Card hq = new Card(CardSymbols.QUEEN, CardColours.Trump, 19, "HQ", 3);
    Card hk = new Card(CardSymbols.KING, CardColours.Hearts, 3, "HK", 4);
    Card ha = new Card(CardSymbols.ACE, CardColours.Hearts, 4, "HA", 11);
    Card s9 = new Card(CardSymbols.NINE, CardColours.Spades, 0, "S9", 0);
    Card s10 = new Card(CardSymbols.TEN, CardColours.Spades, 1, "S10", 10);
    Card sj = new Card(CardSymbols.JACK, CardColours.Trump, 16, "SJ", 2);
    Card sq = new Card(CardSymbols.QUEEN, CardColours.Trump, 20, "SQ", 3);
    Card sk = new Card(CardSymbols.KING, CardColours.Spades, 3, "SK", 4);
    Card sa = new Card(CardSymbols.ACE, CardColours.Spades, 4, "SA", 11);
    Card c9 = new Card(CardSymbols.NINE, CardColours.Clubs, 0, "C9", 0);
    Card c10 = new Card(CardSymbols.TEN, CardColours.Clubs, 1, "C10", 10);
    Card cj = new Card(CardSymbols.JACK, CardColours.Trump, 17, "CJ", 2);
    Card cq = new Card(CardSymbols.QUEEN, CardColours.Trump, 21, "CQ", 3);
    Card ck = new Card(CardSymbols.KING, CardColours.Clubs, 3, "CK", 4);
    Card ca = new Card(CardSymbols.ACE, CardColours.Clubs, 4, "CA", 11);
    Card d9b = new Card(CardSymbols.NINE, CardColours.Trump, 10, "D9", 0);
    Card d10b = new Card(CardSymbols.TEN, CardColours.Trump, 12, "D10", 10);
    Card djb = new Card(CardSymbols.JACK, CardColours.Trump, 14, "DJ", 2);
    Card dqb = new Card(CardSymbols.QUEEN, CardColours.Trump, 18, "DQ", 3);
    Card dkb = new Card(CardSymbols.KING, CardColours.Trump, 13, "DK", 4);
    Card dab = new Card(CardSymbols.ACE, CardColours.Trump, 11, "DA", 11);
    Card h9b = new Card(CardSymbols.NINE, CardColours.Hearts, 0, "H9", 0);
    Card h10b = new Card(CardSymbols.TEN, CardColours.Trump, 100, "H10", 10);
    Card hjb = new Card(CardSymbols.JACK, CardColours.Trump, 15, "HJ", 2);
    Card hqb = new Card(CardSymbols.QUEEN, CardColours.Trump, 19, "HQ", 3);
    Card hkb = new Card(CardSymbols.KING, CardColours.Hearts, 3, "HK", 4);
    Card hab = new Card(CardSymbols.ACE, CardColours.Hearts, 4, "HA", 11);
    Card s9b = new Card(CardSymbols.NINE, CardColours.Spades, 0, "S9", 0);
    Card s10b = new Card(CardSymbols.TEN, CardColours.Spades, 1, "S10", 10);
    Card sjb = new Card(CardSymbols.JACK, CardColours.Trump, 16, "SJ", 2);
    Card sqb = new Card(CardSymbols.QUEEN, CardColours.Trump, 20, "SQ", 3);
    Card skb = new Card(CardSymbols.KING, CardColours.Spades, 3, "SK", 4);
    Card sab = new Card(CardSymbols.ACE, CardColours.Spades, 4, "SA", 11);
    Card c9b = new Card(CardSymbols.NINE, CardColours.Clubs, 0, "C9", 0);
    Card c10b = new Card(CardSymbols.TEN, CardColours.Clubs, 1, "C10", 10);
    Card cjb = new Card(CardSymbols.JACK, CardColours.Trump, 17, "CJ", 2);
    Card cqb = new Card(CardSymbols.QUEEN, CardColours.Trump, 21, "CQ", 3);
    Card ckb = new Card(CardSymbols.KING, CardColours.Clubs, 3, "CK", 4);
    Card cab = new Card(CardSymbols.ACE, CardColours.Clubs, 4, "CA", 11);

    public List<Card> generateAllCards() {
        List<Card> cardStack = new ArrayList<>();
        cardStack.add(d9);
        cardStack.add(d10);
        cardStack.add(dj);
        cardStack.add(dq);
        cardStack.add(dk);
        cardStack.add(da);
        cardStack.add(h9);
        cardStack.add(h10);
        cardStack.add(hj);
        cardStack.add(hq);
        cardStack.add(hk);
        cardStack.add(ha);
        cardStack.add(s9);
        cardStack.add(s10);
        cardStack.add(sj);
        cardStack.add(sq);
        cardStack.add(sk);
        cardStack.add(sa);
        cardStack.add(c9);
        cardStack.add(c10);
        cardStack.add(cj);
        cardStack.add(cq);
        cardStack.add(ck);
        cardStack.add(ca);
        cardStack.add(d9b);
        cardStack.add(d10b);
        cardStack.add(djb);
        cardStack.add(dqb);
        cardStack.add(dkb);
        cardStack.add(dab);
        cardStack.add(h9b);
        cardStack.add(h10b);
        cardStack.add(hjb);
        cardStack.add(hqb);
        cardStack.add(hkb);
        cardStack.add(hab);
        cardStack.add(s9b);
        cardStack.add(s10b);
        cardStack.add(sjb);
        cardStack.add(sqb);
        cardStack.add(skb);
        cardStack.add(sab);
        cardStack.add(c9b);
        cardStack.add(c10b);
        cardStack.add(cjb);
        cardStack.add(cqb);
        cardStack.add(ckb);
        cardStack.add(cab);
        return cardStack;
    }
}

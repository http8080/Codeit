/*카드 정렬
Collections 클래스와 Comparable 인터페이스를 이용해 Card 리스트를 작은 순서로 정렬해봅시다.

룰은 다음과 같습니다:

슈트(suitNumber)가 높은 카드가 '더 크다'.
수트가 같은 경우, 랭크(rankNumber)가 더 높은 카드가 '더 크다'.
템플릿
Main.java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        
        cards.add(new Card(2, 6));
        cards.add(new Card(4, 1));
        cards.add(new Card(3, 11));
        cards.add(new Card(3, 13));
        cards.add(new Card(1, 7));
        cards.add(new Card(3, 1));
        cards.add(new Card(4, 12));
        cards.add(new Card(1, 1));
        
        Collections.sort(cards);
        System.out.println(cards);
    }
}
Card.java
public class Card {
    public final int suitNumber;
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public String getRank() {
        switch (rankNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(rankNumber);
        }
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
콘솔 아웃풋
[Ace of Clubs, 7 of Clubs, 6 of Diamonds, Ace of Hearts, Jack of Hearts, King of Hearts, Ace of S*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        
        cards.add(new Card(2, 6));
        cards.add(new Card(4, 1));
        cards.add(new Card(3, 11));
        cards.add(new Card(3, 13));
        cards.add(new Card(1, 7));
        cards.add(new Card(3, 1));
        cards.add(new Card(4, 12));
        cards.add(new Card(1, 1));
        
        Collections.sort(cards);
        System.out.println(cards);
    }
}
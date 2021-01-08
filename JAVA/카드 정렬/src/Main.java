/*ī�� ����
Collections Ŭ������ Comparable �������̽��� �̿��� Card ����Ʈ�� ���� ������ �����غ��ô�.

���� ������ �����ϴ�:

��Ʈ(suitNumber)�� ���� ī�尡 '�� ũ��'.
��Ʈ�� ���� ���, ��ũ(rankNumber)�� �� ���� ī�尡 '�� ũ��'.
���ø�
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
�ܼ� �ƿ�ǲ
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
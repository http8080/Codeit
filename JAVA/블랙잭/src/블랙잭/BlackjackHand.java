package ����;

/*���� pt. 2
�⺻ ��
������ ���� ����ȭ�� ���� �����ϰڽ��ϴ�.

������ �÷��̾ ī�带 �� �徿 �޽��ϴ�.
ó�� ���� �� ���� ���� 21�̸� '����'�Դϴ�. �ڵ����� �¸��մϴ�.
������ �÷��̾� �� �ڵ� ��ġ(ī�� ��ġ�� ��)�� �� ���� ����� �̱�ϴ�. ������ �ڵ� ��ġ�� 21�� �Ѿ�� �й��մϴ�.
ī�带 �� ���� �� �ֽ��ϴ�.
Ace�� �Ϲ������� 11�� ��ġ�� ������, �ڵ� ��ġ(ī�� ��ġ�� ��)�� 21�� �Ѿ ��� 1�� ��ġ�� �����ϴ�.
BlackJackHand
'ī�� ���÷�' �������� ������� Deck�� ��ӹ޾�, ī�带 �� BlackjackHand Ŭ������ �����غ��ô�.

ĳ����
BlackjackHand�� �����ϴµ� �����ؾ� �� ���� �ֽ��ϴ�.

Deck Ŭ�������� ����� ArrayList�� Card �ν��Ͻ��� ��� ArrayList�Դϴ�.

public class Deck {
    private ArrayList<Card> cards;
    ...
}
Card Ŭ������ ����� BlackjackCard �ν��Ͻ��� cards�� ���� �� �ְ���? ������ cards���� BlackjackCard �ν��Ͻ��� ������ �� ������ ĳ������ �� �ʿ��մϴ�! �� ���� �����ϸ� BlackjackHand Ŭ������ �ۼ��غ��ô�.

public int getValue()
������ �꿡 �°� �ڵ��� ��ġ�� �����ϴ� �޼ҵ带 ���ּ���.

public boolean isBusted()
�ڵ��� ��ġ�� 21�� ������ '�Ļ�(Busted)'�Դϴ�. ���� �ڵ尡 �Ļ��ߴ��� �������ִ� �޼ҵ带 ���ּ���.

public boolean isBlackjack()
�ڵ尡 �� ���� ī�常 ������ �ְ� ��ġ�� 21�̸� '����'�Դϴ�. ���� �ڵ尡 �������� �������ִ� �޼ҵ带 ���ּ���.





���ø�
Main.java
public class Main {
    public static void main(String[] args) {
        BlackjackHand hand1 = new BlackjackHand();
        hand1.addCard(new BlackjackCard(3, 1));
        hand1.addCard(new BlackjackCard(4, 11));
        System.out.println(hand1.getValue());
        System.out.println(hand1.isBlackjack());
        System.out.println(hand1.isBusted());
        
        BlackjackHand hand2 = new BlackjackHand();
        hand2.addCard(new BlackjackCard(1, 4));
        hand2.addCard(new BlackjackCard(2, 8));
        hand2.addCard(new BlackjackCard(2, 9));
        System.out.println(hand2.getValue());
        System.out.println(hand2.isBlackjack());
        System.out.println(hand2.isBusted());
        
        BlackjackHand hand3 = new BlackjackHand();
        hand3.addCard(new BlackjackCard(2, 5));
        hand3.addCard(new BlackjackCard(4, 9));
        hand3.addCard(new BlackjackCard(2, 13));
        System.out.println(hand3.getValue());
        System.out.println(hand3.isBlackjack());
        System.out.println(hand3.isBusted());
        
        BlackjackHand hand4 = new BlackjackHand();
        hand4.addCard(new BlackjackCard(2, 8));
        hand4.addCard(new BlackjackCard(1, 1));
        System.out.println(hand4.getValue());
        System.out.println(hand4.isBlackjack());
        System.out.println(hand4.isBusted());
        
        BlackjackHand hand5 = new BlackjackHand();
        hand5.addCard(new BlackjackCard(1, 7));
        hand5.addCard(new BlackjackCard(1, 9));
        hand5.addCard(new BlackjackCard(3, 1));
        System.out.println(hand5.getValue());
        System.out.println(hand5.isBlackjack());
        System.out.println(hand5.isBusted());
        
        BlackjackHand hand6 = new BlackjackHand();
        hand6.addCard(new BlackjackCard(2, 1));
        hand6.addCard(new BlackjackCard(1, 1));
        System.out.println(hand6.getValue());
        System.out.println(hand6.isBlackjack());
        System.out.println(hand6.isBusted());
    }
}
BlackjackHand.java
public class BlackjackHand extends Deck {
    public int getValue() {
        // �ڵ带 ä�� ��������.
    }

    public boolean isBusted() {
        // �ڵ带 ä�� ��������.
    }

    public boolean isBlackjack() {
        // �ڵ带 ä�� ��������.
    }
}
�ܼ� �ƿ�ǲ
21
true
false
21
false
false
24
false
true
19
false
false
17
false
false
12
false
false
<����> Main.java ����, Card.java ����, Deck.java ������ �������� ������. ���ϴ� ���� ��������, �ٸ� Ŭ������ �� �������ּ���.

<����> �ڵ� ä�� �����̱� ������, ������ ���ǿ� ��Ȯ�� �����ֽñ� �ٶ��ϴ�. ���⵵ ��ġ�ؾ� �մϴ�.*/

public class BlackjackHand extends Deck<BlackjackCard> {
	
	public int getValue() {
		int value = 0;
		int aceCount = 0;
		
		for(BlackjackCard card : getCards()) {
			BlackjackCard cards = card;
			if(cards.isAce()) {
				aceCount++;
			}
			value += cards.getValue();
		}
		
		while(aceCount > 0 && value > 21) {
			value -= 10;
			aceCount--;
		}
		return value;
	}
	
	public boolean isBusted() {
		return getValue() > 21;
	}
	
	public boolean isBlackjack() {
		return getValue() == 21  && getCards().size() == 2;
	}

}

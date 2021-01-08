package ����;

/*
'ī�� ���÷�' ������ Card Ŭ������ ��ӹ޴� BlackjackCard�� ����� ���ô�.

Blackjack�̶�?
������ �·��� 50%�� �����, ���п� ���� �������� ���� ī�� �����Դϴ�. ���� ������ �����ϴ� ������� ���� ��̸� ���� �մϴ�! 2008�⵵���� �̸� ������ �� ��ȭ 21(���̹� ��ȭ)�� �����߾���.

�̹� ���������� ���� ��� �Ұ������� �ʰڽ��ϴ�. �ڼ��� ���� �˰� ������ ���� �� ��ũ(��Ű�ǵ��)�� ������ �ֽñ� �ٶ��ϴ�.

BlackjackCard Ŭ����
���迡���� ī���� ��ġ�� ����ϴ� ����� ���� �ٸ��ϴ�.

Ace�� ��� 1 �Ǵ� 11�� ��ġ�� �����ϴ�.

Jack, Queen, King�� ��� ��� 10�� ��ġ�� �����ϴ�.

Ace, Jack, Queen, King�� ������ (���ڸ� ����) ī����� ��� �ڱ� �ڽ��� ���ڸ�ŭ�� ��ġ�� �����ϴ�. ���� �� '5' ī���� ��ġ�� 5�Դϴ�.

BlackjackCard�� Card�� ��ӹް�, ���� ���� �Ϲ� Card�� �ٸ� ���� �������ָ� ������?

public int getValue()
���� ī���� ��ġ�� 'value'�� Ī�ϰ� getValue �޼ҵ带 ���ؼ� ������ �� �ֵ��� �ϰڽ��ϴ�.

public int getValue() {
    // �޼ҵ� ���θ� �������ּ���
}
����� Ace�� 11�� �����մϴ�. Ace�� 1�� ��ġ�� ���� ���� ���� �������� ���ڽ��ϴ�.

public boolean isAce()
Ace�� �� ���� ���� ���� �� �ִ� Ư���� ī�� �Դϴ�. ���� �ش� ī�尡 Ace���� �ƴ��� Ȯ���ϴ� isAce �޼ҵ带 ���ڽ��ϴ�.

public boolean isAce() {
    // �޼ҵ� ���θ� ������ �ּ���
}
���ø�
Card�� ��ӹ޴� ����, �׸��� ���� �� �޼ҵ� ��� �������ּ���.

Main.java
public class Main {
    public static void main(String[] args) {
        BlackjackCard card1 = new BlackjackCard(1, 1);
        BlackjackCard card2 = new BlackjackCard(2, 6);
        BlackjackCard card3 = new BlackjackCard(4, 12);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println(card3.getValue());
        System.out.println(card3.isAce());
    }
}
BlackjackCard.java
public class BlackjackCard {

}
�ܼ� �ƿ�ǲ
11
true
6
false
10
false
<����> Main.java ����, Card.java ����, Deck.java ������ �������� ������. ���ϴ� ���� ��������, �ٸ� Ŭ������ �� �������ּ���.

<����> �ڵ� ä�� �����̱� ������, ������ ���ǿ� ��Ȯ�� �����ֽñ� �ٶ��ϴ�. ���⵵ ��ġ�ؾ� �մϴ�.
*/

public class BlackjackCard extends Card {

	public BlackjackCard(int suitNumber, int rankNumber) {
		super(suitNumber, rankNumber);
	}

	public int getValue() {
		switch (rankNumber) {
		case 1:
			return 11;
		case 11:
		case 12:
		case 13:
			return 10;
		default:
			return rankNumber;
		}
	}

	public boolean isAce() {
		return rankNumber == 1;
	}

}

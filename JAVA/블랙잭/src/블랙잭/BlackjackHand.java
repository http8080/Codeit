package 블랙잭;

/*블랙잭 pt. 2
기본 룰
블랙잭의 아주 간략화된 룰을 설명하겠습니다.

딜러와 플레이어가 카드를 두 장씩 받습니다.
처음 받은 두 장의 합이 21이면 '블랙잭'입니다. 자동으로 승리합니다.
딜러와 플레이어 중 핸드 가치(카드 가치의 합)가 더 높은 사람이 이깁니다. 하지만 핸드 가치가 21이 넘어가면 패배합니다.
카드를 더 받을 수 있습니다.
Ace는 일반적으로 11의 가치를 갖지만, 핸드 가치(카드 가치의 합)가 21이 넘어간 경우 1의 가치를 갖습니다.
BlackJackHand
'카드 셔플러' 과제에서 만들었던 Deck를 상속받아, 카드를 쥘 BlackjackHand 클래스를 구현해봅시다.

캐스팅
BlackjackHand를 구현하는데 주의해야 할 것이 있습니다.

Deck 클래스에서 선언된 ArrayList는 Card 인스턴스를 담는 ArrayList입니다.

public class Deck {
    private ArrayList<Card> cards;
    ...
}
Card 클래스를 상속한 BlackjackCard 인스턴스도 cards에 넣을 수 있겠죠? 하지만 cards에서 BlackjackCard 인스턴스를 꺼내서 쓸 때에는 캐스팅이 꼭 필요합니다! 이 점을 유의하며 BlackjackHand 클래스를 작성해봅시다.

public int getValue()
블랙잭의 룰에 맞게 핸드의 가치를 리턴하는 메소드를 써주세요.

public boolean isBusted()
핸드의 가치가 21을 넘으면 '파산(Busted)'입니다. 현재 핸드가 파산했는지 리턴해주는 메소드를 써주세요.

public boolean isBlackjack()
핸드가 두 장의 카드만 가지고 있고 가치가 21이면 '블랙잭'입니다. 현재 핸드가 블랙잭인지 리턴해주는 메소드를 써주세요.





템플릿
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
        // 코드를 채워 넣으세요.
    }

    public boolean isBusted() {
        // 코드를 채워 넣으세요.
    }

    public boolean isBlackjack() {
        // 코드를 채워 넣으세요.
    }
}
콘솔 아웃풋
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
<주의> Main.java 파일, Card.java 파일, Deck.java 파일은 변경하지 마세요. 원하는 값이 나오도록, 다른 클래스를 잘 정의해주세요.

<주의> 자동 채점 과제이기 때문에, 문제의 조건에 정확히 따라주시기 바랍니다. 띄어쓰기도 일치해야 합니다.*/

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

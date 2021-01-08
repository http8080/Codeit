package 블랙잭;

/*
'카드 셔플러' 과제의 Card 클래스를 상속받는 BlackjackCard를 만들어 봅시다.

Blackjack이란?
블랙잭은 승률이 50%에 가까운, 수학에 대한 의존성이 높은 카드 게임입니다. 따라서 수학을 좋아하는 사람들이 쉽게 흥미를 갖곤 합니다! 2008년도에는 이를 주제로 한 영화 21(네이버 영화)도 개봉했었죠.

이번 과제에서는 룰을 모두 소개하지는 않겠습니다. 자세한 룰을 알고 싶으신 분은 이 링크(위키피디아)를 참고해 주시기 바랍니다.

BlackjackCard 클래스
블랙잭에서는 카드의 가치를 계산하는 방식이 조금 다릅니다.

Ace의 경우 1 또는 11의 가치를 갖습니다.

Jack, Queen, King의 경우 모두 10의 가치를 갖습니다.

Ace, Jack, Queen, King을 제외한 (숫자를 가진) 카드들은 모두 자기 자신의 숫자만큼의 가치를 갖습니다. 예를 들어서 '5' 카드의 가치는 5입니다.

BlackjackCard는 Card를 상속받고, 위와 같이 일반 Card와 다른 점을 구현해주면 좋겠죠?

public int getValue()
블랙잭 카드의 가치를 'value'라 칭하고 getValue 메소드를 통해서 가져올 수 있도록 하겠습니다.

public int getValue() {
    // 메소드 내부를 구현해주세요
}
참고로 Ace는 11을 리턴합니다. Ace가 1의 가치를 갖는 경우는 다음 과제에서 보겠습니다.

public boolean isAce()
Ace는 두 가지 값을 가질 수 있는 특별한 카드 입니다. 따라서 해당 카드가 Ace인지 아닌지 확인하는 isAce 메소드를 쓰겠습니다.

public boolean isAce() {
    // 메소드 내부를 구현해 주세요
}
템플릿
Card를 상속받는 과정, 그리고 위의 두 메소드 모두 구현해주세요.

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
콘솔 아웃풋
11
true
6
false
10
false
<주의> Main.java 파일, Card.java 파일, Deck.java 파일은 변경하지 마세요. 원하는 값이 나오도록, 다른 클래스를 잘 정의해주세요.

<주의> 자동 채점 과제이기 때문에, 문제의 조건에 정확히 따라주시기 바랍니다. 띄어쓰기도 일치해야 합니다.
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

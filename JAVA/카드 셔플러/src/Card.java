
public class Card {
	public final int suitNumber, rankNumber;

	// 파라미터로 정수형 suit와 rank를 받고,
	// 인스턴스 변수 suit와 rank에 각각 지정해줍니다.
	// 1 <= suit <= 4, 1 <= rank <= 13라고 가정합시다!

	public Card(int suitNumber, int rankNumber) {
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
	}

	// 카드의 모양을 뜻합니다.
	// 카드 모양에는 정수 1, 2, 3, 4로 표현되는
	// '클로버(Clubs)', '하트(Hearts)',
	// '다이아몬드(Diamonds', '스페이드(Spades)'가 있습니다.
	// 한 번 정해지면 바뀔 이유가 없기 때문에 final입니다.
	// 또한 특별히 getter가 필요 없기 때문에 public 입니다.

	public final int suitNumber() {
		if (1 <= suitNumber && suitNumber <= 4)
			return suitNumber;
		else
			return 0;
	}

	// 카드의 값을 뜻합니다.
	// 1, 11, 12, 13은 각각 'Ace', 'Jack', 'Queen', 'King'
	// 로 표현되고,
	// 2~10은 그 숫자 자체로 표현됩니다.
	// 마찬가지로 한 번 정해지면 바뀔 이유가 없기 때문에 public final입니다.

	public final int rankNumber() {
		if (1 <= rankNumber && rankNumber <= 13)
			return rankNumber;
		else
			return 0;
	}

	// 변수 suit의 숫자 값에 해당하는 슈트(suit)를 리턴해줍니다.

	public String getSuit() {
		String [] Suit = {"Clubs", "Hearts", "Diamonds", "Spades"};
		if(suitNumber == 0) {
			return null;
		} else {
			return Suit[suitNumber - 1];
		}
	}

	// 변수 number의 숫자 값에 해당하는 카드 랭크를 리턴해줍니다.

	public String getRank() {
		String[] Rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		if (rankNumber == 0) {
			return null;
		} else {
			return Rank[rankNumber - 1];
		}
	}

	// 카드를 "{랭크} of {슈트}" 방식으로 예쁘게 요약해줍니다.

	public String toString() {
		String card = getSuit() + " of " + getRank();
		return card;
	}
}

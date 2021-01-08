
public class Card {
	public final int suitNumber, rankNumber;

	// �Ķ���ͷ� ������ suit�� rank�� �ް�,
	// �ν��Ͻ� ���� suit�� rank�� ���� �������ݴϴ�.
	// 1 <= suit <= 4, 1 <= rank <= 13��� �����սô�!

	public Card(int suitNumber, int rankNumber) {
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
	}

	// ī���� ����� ���մϴ�.
	// ī�� ��翡�� ���� 1, 2, 3, 4�� ǥ���Ǵ�
	// 'Ŭ�ι�(Clubs)', '��Ʈ(Hearts)',
	// '���̾Ƹ��(Diamonds', '�����̵�(Spades)'�� �ֽ��ϴ�.
	// �� �� �������� �ٲ� ������ ���� ������ final�Դϴ�.
	// ���� Ư���� getter�� �ʿ� ���� ������ public �Դϴ�.

	public final int suitNumber() {
		if (1 <= suitNumber && suitNumber <= 4)
			return suitNumber;
		else
			return 0;
	}

	// ī���� ���� ���մϴ�.
	// 1, 11, 12, 13�� ���� 'Ace', 'Jack', 'Queen', 'King'
	// �� ǥ���ǰ�,
	// 2~10�� �� ���� ��ü�� ǥ���˴ϴ�.
	// ���������� �� �� �������� �ٲ� ������ ���� ������ public final�Դϴ�.

	public final int rankNumber() {
		if (1 <= rankNumber && rankNumber <= 13)
			return rankNumber;
		else
			return 0;
	}

	// ���� suit�� ���� ���� �ش��ϴ� ��Ʈ(suit)�� �������ݴϴ�.

	public String getSuit() {
		String [] Suit = {"Clubs", "Hearts", "Diamonds", "Spades"};
		if(suitNumber == 0) {
			return null;
		} else {
			return Suit[suitNumber - 1];
		}
	}

	// ���� number�� ���� ���� �ش��ϴ� ī�� ��ũ�� �������ݴϴ�.

	public String getRank() {
		String[] Rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		if (rankNumber == 0) {
			return null;
		} else {
			return Rank[rankNumber - 1];
		}
	}

	// ī�带 "{��ũ} of {��Ʈ}" ������� ���ڰ� ������ݴϴ�.

	public String toString() {
		String card = getSuit() + " of " + getRank();
		return card;
	}
}

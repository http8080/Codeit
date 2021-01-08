import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	
	//���� �ִ� ī�带 �����ϴ� ArrayList�Դϴ�.
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	//ī�� ����� �������ݴϴ�.
	public void addCard(Card card) {
		cards.add(card);
	}
	
	//�Ķ���ͷ� card�� �ް� cards�� �߰����ݴϴ�.
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	//ī�� ��Ͽ� �ִ� ��� ī�带 ����մϴ�.
	//����� ���� ī�� �ν��Ͻ��� toString �޼ҵ带 ����ϼ���.
	public void print() {
		for(Card card : cards) {
			System.out.println(card.toString());
		}
	}
	
	//cards�� ������ ���׹��� �����ϴ�.
	//Random Ŭ������ �̿��ؼ� ������ �����ϰ� �����ּ���!
	public void shuffle() {
		Random random = new Random();
		
		for(int i = 0; i < cards.size(); i++) {
			int randindx = random.nextInt(cards.size());
			Card temp = cards.get(i);
			cards.set(i, cards.get(randindx));
			cards.set(randindx, temp);
		}
	}
	
	//���� hand��� ���ο� Deck �ν��Ͻ��� ���弼��.
	//count�� 5�� ���� ���� cards�� ������ �ټ� ���� ����,
	//�� �ټ� ���� hand�� cards�� �־��ּ���.
	//�׸��� hand�� �������ָ� �˴ϴ�.
	public Deck deal(int count) {
		Deck hand = new Deck();
		
		for(int i = 0; i < count; i++)
			hand.addCard(cards.remove(0));
		
		return hand;
	}
}

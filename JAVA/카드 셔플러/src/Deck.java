import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	
	//덱에 있는 카드를 보관하는 ArrayList입니다.
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	//카드 목록을 리턴해줍니다.
	public void addCard(Card card) {
		cards.add(card);
	}
	
	//파라미터로 card를 받고 cards에 추가해줍니다.
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	//카드 목록에 있는 모든 카드를 출력합니다.
	//출력할 때는 카드 인스턴스의 toString 메소드를 사용하세요.
	public void print() {
		for(Card card : cards) {
			System.out.println(card.toString());
		}
	}
	
	//cards의 순서를 뒤죽박죽 섞습니다.
	//Random 클래스를 이용해서 완전히 랜덤하게 섞어주세요!
	public void shuffle() {
		Random random = new Random();
		
		for(int i = 0; i < cards.size(); i++) {
			int randindx = random.nextInt(cards.size());
			Card temp = cards.get(i);
			cards.set(i, cards.get(randindx));
			cards.set(randindx, temp);
		}
	}
	
	//먼저 hand라는 새로운 Deck 인스턴스를 만드세요.
	//count가 5면 현재 덱의 cards의 마지막 다섯 장을 빼고,
	//그 다섯 장을 hand의 cards에 넣어주세요.
	//그리고 hand를 리턴해주면 됩니다.
	public Deck deal(int count) {
		Deck hand = new Deck();
		
		for(int i = 0; i < count; i++)
			hand.addCard(cards.remove(0));
		
		return hand;
	}
}

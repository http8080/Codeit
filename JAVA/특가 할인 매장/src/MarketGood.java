
public class MarketGood {
	private String name; //상품의 이름
	private int retailPrice; //상품의 출시 가격
	private int discountRate; //상품의 할인율. 단위: %
	
	public String getName() {
		return name;
	}
	
	public int getRetailPrice() {
		return retailPrice;
	}
	
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public int getDiscountRate() {
		return discountRate;
	}
	
	public MarketGood(String name, int retailPrice, int discountRate) {
		if(discountRate < 0 || discountRate > 100)
			this.discountRate = 0;
		else
			this.discountRate = discountRate;
		
		this.name = name;
		this.retailPrice = retailPrice;
	}
	
	public MarketGood(String name, int retailPrice) {
		this(name, retailPrice, 0);
	}
	
	public int getDiscountedPrice() {
		return this.retailPrice * (100 - this.discountRate) / 100;
	}

}

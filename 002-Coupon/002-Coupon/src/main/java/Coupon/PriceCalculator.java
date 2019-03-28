package Coupon;

public class PriceCalculator {

	public int getOrderPrice(Item item, ICoupon coupon) {
		if(coupon.isValid() && coupon.isApplicable(item)) {
			return (int)(item.getPrice()*getDiscountRate(coupon.getDiscountPercent()));
		}
		return item.getPrice();
	}
	
	private double getDiscountRate(int percent) {
		return (100 - percent) / 100d;
	}

}

package Coupon;

public class StubCoupon implements ICoupon {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ÇÑ°¡À§ ÄíÆù";
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public void doExpire() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isApplicable(Item item) {
		// TODO Auto-generated method stub
		return true;
	}

}

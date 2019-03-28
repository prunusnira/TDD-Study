package Coupon;

public class DummyCoupon implements ICoupon {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doExpire() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isApplicable(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

}

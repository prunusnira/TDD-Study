package Coupon;

public class FakeCouponSpy implements ICoupon {
	private int appliableCount;
	
	public FakeCouponSpy() {
		appliableCount = 0;
	}

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
		appliableCount++;
		// TODO Auto-generated method stub
		if(item.getCategory().equals("ºÎ¾ýÄ®"))
			return true;
		if(item.getCategory().equals("¾Ë¶÷½Ã°è"))
			return false;
		return false;
	}
	
	public int getAppliableCallCount() {
		return appliableCount;
	}

}

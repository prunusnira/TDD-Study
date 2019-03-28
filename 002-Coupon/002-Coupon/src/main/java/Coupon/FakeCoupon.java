package Coupon;

public class FakeCoupon implements ICoupon {

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
		if(item.getCategory().equals("ºÎ¾ýÄ®"))
			return true;
		if(item.getCategory().equals("¾Ë¶÷½Ã°è"))
			return false;
		return false;
	}

}

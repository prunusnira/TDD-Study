package Coupon;

public class FakeCouponSpy implements ICoupon {
	private int appliableCount;
	
	public FakeCouponSpy() {
		appliableCount = 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "�Ѱ��� ����";
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
		if(item.getCategory().equals("�ξ�Į"))
			return true;
		if(item.getCategory().equals("�˶��ð�"))
			return false;
		return false;
	}
	
	public int getAppliableCallCount() {
		return appliableCount;
	}

}

package Coupon;

import java.util.LinkedList;

public class User {
	public int couponCount;
	public LinkedList<ICoupon> couponList;

	public User(String string) {
		couponCount = 0;
		couponList = new LinkedList<>();
	}

	public int getTotalCouponCount() {
		// TODO Auto-generated method stub
		return couponCount;
	}
	
	public void addCoupon(ICoupon coupon) {
		couponList.add(coupon);
		couponCount++;
	}

	public ICoupon getLastOccupiedCoupon() {
		// TODO Auto-generated method stub
		return couponList.getLast();
	}

}

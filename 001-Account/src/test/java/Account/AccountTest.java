package Account;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	private Account account;

	@Before
	public void setup() {
		account = new Account(10000);
	}

	// 생성자에서 로직적인 부분이 들어간다면 생성에 대한 테스트 케이스가 필요할 수도 있다
	// 그렇지 않다면 생략하는 경우도 많지만, 코드를 이용한 커뮤니케이션이라는 측면에서는 필요하다
	@Test
	public void testAccount() throws Exception {
	}
	
	@Test
	public void testGetBalance() throws Exception {
		if(account.getBalance() != 10000)
			fail("getBalance() = " + account.getBalance()); // JUnit 로그 작성
		
		// 아래와 동일한 코드 (맨 앞의 메시지 생략 가능) - JUnit의 메소드
		assertEquals("10000원 계좌 생성 후 조회", 10000, account.getBalance());
		
		account = new Account(1000);
		if(account.getBalance() != 1000)
			fail();
		
		account = new Account(0);
		if(account.getBalance() != 0)
			fail();
	}
	
	@Test
	public void testDeposit() throws Exception {
		account.deposit(1000);
		assertEquals("Deposit 잔고 확인", 11000, account.getBalance());
	}
	
	@Test
	public void testWithdraw() throws Exception {
		account.withdraw(1000);
		assertEquals("Withdraw 잔고 확인", 9000, account.getBalance());
	}
}
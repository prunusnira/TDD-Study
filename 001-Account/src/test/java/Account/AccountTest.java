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

	// �����ڿ��� �������� �κ��� ���ٸ� ������ ���� �׽�Ʈ ���̽��� �ʿ��� ���� �ִ�
	// �׷��� �ʴٸ� �����ϴ� ��쵵 ������, �ڵ带 �̿��� Ŀ�´����̼��̶�� ���鿡���� �ʿ��ϴ�
	@Test
	public void testAccount() throws Exception {
	}
	
	@Test
	public void testGetBalance() throws Exception {
		if(account.getBalance() != 10000)
			fail("getBalance() = " + account.getBalance()); // JUnit �α� �ۼ�
		
		// �Ʒ��� ������ �ڵ� (�� ���� �޽��� ���� ����) - JUnit�� �޼ҵ�
		assertEquals("10000�� ���� ���� �� ��ȸ", 10000, account.getBalance());
		
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
		assertEquals("Deposit �ܰ� Ȯ��", 11000, account.getBalance());
	}
	
	@Test
	public void testWithdraw() throws Exception {
		account.withdraw(1000);
		assertEquals("Withdraw �ܰ� Ȯ��", 9000, account.getBalance());
	}
}
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import deposit.Account;


public class AccountTest {

    @BeforeClass
    public static void start() {
        System.out.println("Starting tests...");
    }
    @AfterClass
    public static void end() {
        System.out.println("Ending tests...");
    }

    @Before
    public void beforeEach() {
        System.out.println("Running test...");
    }

    @After
    public void after() {
        System.out.println("Test complete.");
    }

    @Test
    public void testDeposit() {
        Account account = new Account(0.0);
        account.deposit(100.5);
        double expected = 100.5;
        assert(expected == account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account(50.0);
        account.withdraw(25.0);
        double expected = 50.0 - 25.0;
        assert(expected == account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        Account account = new Account(50.0);
        account.withdraw(75.0);
        double expected = 50.0;
        assert(expected == account.getBalance());
    }

    @Test
    public void testCheckBalance() {
        Account account = new Account(100.0);
        double expected = 100.0;
        assert(expected == account.getBalance());
    }

}

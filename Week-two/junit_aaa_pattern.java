import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("John", 1000.0);
    }

    @Test
    void testDeposit() {
        // Arrange is handled in setUp()
        double depositAmount = 500.0;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        double withdrawAmount = 300.0;

        account.withdraw(withdrawAmount);

        assertEquals(700.0, account.getBalance());
    }
}

class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

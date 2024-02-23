import java.util.List;

public interface AccountService {

    List<Account> readAccounts();
    Account readAccountById(int accountId);
    public void addAccount(Account acc);
    public void deleteAccount(int accountId);

}

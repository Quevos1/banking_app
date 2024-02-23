import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

public class AccountServiceImpl implements AccountService{
    @Override
    public List<Account> readAccounts() {
        return null;
    }

    @Override
    public Account readAccountById(int accountId) {
        return null;
    }

    @Override
    public void addAccount(Account acc) {
        Customer user = acc.getUser();
        try {
            LocalDate myObj = LocalDate.now();
            PrintWriter  myWriter = new PrintWriter("Users.txt");
            myWriter.println("AccountID\tAccountNumber\tUserName\tUserSurname\tAccountType");

            myWriter.println(acc.getAccountId()+"\t"+ acc.getAccountNumber()+"\t"+user.getName()+"\t"+user.getSurname()+"\t"+acc.getAccountType()+"\t"+myObj);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    @Override
    public void deleteAccount(int accountId) {

    }
}

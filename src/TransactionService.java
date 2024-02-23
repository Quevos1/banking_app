import java.util.List;

public interface TransactionService {
    List<Transaction>readTransactions();
    public void addTransaction( Transaction trans);
    public void removeTransaction(int transactionId);
    Transaction getTransactionById(int transId);
}

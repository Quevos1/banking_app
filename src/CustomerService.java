import java.util.List;

public interface CustomerService {
    List<Customer> customersList();
    public void addCustomers(Customer customer);
    public void deleteCustomer(Customer customer);
    public Customer getCustomerById(int customerId);



}

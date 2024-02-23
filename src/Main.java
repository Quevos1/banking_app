import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    Menu menu = new Menu();
    Account acc = new Account();
    menu.ShowMenu();
    int option = obj.nextInt();
    switch (option)
    {
        case 1:
            System.out.println("Please Enter your name");
            String name = obj.next();
            System.out.println("Please Enter your surname");
            String surname = obj.next();
            System.out.println("Please Enter your ID number");
           long id = obj.nextLong();
            System.out.println("Please Enter your phone numbers");
         int phone = obj.nextInt();
            System.out.println("Please Enter your Emailaddres");
            String email = obj.next();
            System.out.println("Please Enter Account Type");
            String accountType = obj.next();
            System.out.println(name+" you have successfully created an account");
            Customer customer = new Customer();
            customer.setName(name);
            customer.setSurname(surname);
            customer.setId(id);
            customer.setEmailaddress(email);
            customer.setPhoneNo(phone);
            AccountService account = new AccountServiceImpl();
            acc.setUser(customer);
            acc.setAccountType(accountType);
            account.addAccount(acc);

            break;
        case 2:
            System.out.println("Please select your account \n1. Savings\n2. Cheque\n3. Transactional");
            option = obj.nextInt();
            System.out.println("How much do you want to Withdraw");
            option = obj.nextInt();
            break;

    }

    }
}
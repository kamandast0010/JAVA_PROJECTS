import java.util.Scanner;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Account(){
        this("Default Name",500.00,"kam@gmail.com","12345",567890);
        System.out.println("Empty constructor called...");
    }
    public Account(String customerName, double accountBalance, String email, String phoneNumber, int accountNumber){
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }
    public void depositFund() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Deposit Value: ");
        double cash = scanner.nextDouble();
        if (cash >= 20) {
            accountBalance += cash;
            System.out.println("Funds deposited.Your New balance is: " + accountBalance);
        }else{
            System.out.println("Minimum deposit fund is 20: ....");
        }
    }

    public void withdrawFunds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Withdrawal Value: ");
        double withdrawMoney = scanner.nextDouble();
        if (withdrawMoney > 0 && withdrawMoney < accountBalance) {
            accountBalance -= withdrawMoney;
            System.out.println("Withdrawal Successful: Balance = " + accountBalance);
        } else {
            System.out.println("Withdrawal Rejected insufficient funds or invalid value...");
        }
    }
    public void getDetails(){
        System.out.println("Name: " + customerName + "\nEmail: " + email + "\nPhoneNumber: " + phoneNumber +
                "\naccountNumber: " + accountNumber);
    }
}

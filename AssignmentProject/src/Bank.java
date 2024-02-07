import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private String bankName;
    public String bankLocation;
    public String bankType;
    protected ArrayList<String> bankStaff = new ArrayList<String>();

    //created a protected attributes because I want to use them in subclasses without declaring them
    protected int accountNumber;
    private double accountBalance;
    protected String customerName;
    protected String email;
    protected String phoneNumber;


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

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Bank() {
        //empty constructor
    }

    public Bank(String customerName, double accountBalance, String email, String phoneNumber, int accountNumber) {
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
        } else {
            System.out.println("Minimum deposit fund is 20: ....");
        }
    }

    public void withdrawFunds(boolean isWithdrawMoney) {

        Scanner scanner = new Scanner(System.in);
        while(isWithdrawMoney){
            System.out.println("Enter Withdrawal Value: ");
            double withdrawMoney = scanner.nextDouble();
            if (withdrawMoney >= 20 && withdrawMoney < accountBalance) {
                accountBalance -= withdrawMoney;
                System.out.println("Withdrawal Successful: Balance = " + accountBalance);
                break;
            } else {
                System.out.println("Withdrawal Rejected insufficient funds or invalid value...");
            }
        }

    }

    public void getDetails() {
        System.out.println("BankName: " + bankName + "\nBankType: " + bankType + "\nBankLocation: " + bankLocation);
    }

}

class Staff extends Bank {
    private String staffName;
    private String staffRole;
    private int staffId;
    private String staffDepartment;

    public Staff() {
        //empty constructor...
    }

    public Staff(String staffName, String staffRole, int staffId, String staffDepartment) {
        this.staffName = staffName;
        this.staffRole = staffRole;
        this.staffId = staffId;
        this.staffDepartment = staffDepartment;
    }

    public void staff(){
        bankStaff.add("Sullaiman Kamanda");
        bankStaff.add("Mariama Mansaray");
        bankStaff.add("Ibrahim Kargbo");
        bankStaff.add("Sullaiman Sesay");
        bankStaff.add("John Momoh Koroma");
        bankStaff.add("Yeaniva Bayoh");
        bankStaff.add("Omaru Calla");
        bankStaff.add("Abubakarr");

        for(String staff : bankStaff){
            System.out.println(staff);
        }

    }

    @Override
    public void getDetails() {
        System.out.println("StaffName: " + staffName + "\nStaffRole: " + staffRole + "\nStaffId: " + staffId + "\nDepartment: "
                + staffDepartment);
    }
}

class Customers extends Bank {

    public int generateAccountNumber() {
        accountNumber = 1;
        int genInt = accountNumber;
        accountNumber++;
        return genInt;
    }

    public void registerUser() {
//        String createAccount = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------Enter User Account Information--------------------------- ");
        System.out.println("Enter User Name: ");
        customerName = scanner.nextLine();
        System.out.println("Enter email address: ");
        email = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Registration Successful...............................");
        getDetails();

    }

    @Override
    public void getDetails() {
        System.out.println("Name: " + customerName + "\nEmail: " + email + "\nPhoneNumber: " + phoneNumber + "\nAccountNumber: "
                + generateAccountNumber());
    }
}

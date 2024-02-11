import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank{
    private String bankName;
    private String bankLocation;
    private String bankType;
    private ArrayList<Customers> bankCustomers;


    //created a method to add customer in the bank
    public void addCustomer(){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------Enter Customer Information------------------------");
        System.out.println("Enter Customer Id: ");
        int customerId = scan.nextInt();
        System.out.println("Enter Customer Name: ");
        String customerName = scan.nextLine();
        System.out.println("Enter CustomerAccountNumber: ");
        int customerAccountNumber = scan.nextInt();
        System.out.println("Enter AccountBalance: ");
        double accountBalance = scan.nextDouble();
        System.out.println("Enter CustomerEmail: ");
        String customerEmail = scan.nextLine();
        bankCustomers.add(new Customers(customerId,customerName,customerAccountNumber,accountBalance,customerEmail));

    }

//    public void addStaff(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("------------------------Enter Customer Information------------------------");
//        System.out.println("Enter staffId: ");
//        int staffId = scan.nextInt();
//        System.out.println("Enter staffName: ");
//        String staffName = scan.nextLine();
//        System.out.println("Enter staffEmail: ");
//        String staffEmail = scan.nextLine();
//        System.out.println("Enter staffDepartment: ");
//        String staffDepartment = scan.nextLine();
//        bankStaffs.add(new Staff(staffId,staffName,staffEmail,staffDepartment));
//    }
}
class Customers extends Bank{
    private int customerId;
    private String customerName;
    private int customerAccountNumber;
    private double accountBalance;
    private String customerEmail;

    public Customers(int customerId, String customerName, int customerAccountNumber, double accountBalance, String customerEmail) {
        super();
    }

//    public int getCustomerId(){
//        return customerId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public int getCustomerAccountNumber() {
//        return customerAccountNumber;
//    }
//
//    public double getAccountBalance() {
//        return accountBalance;
//    }
//
//    public String getCustomerEmail() {
//        return customerEmail;
//    }

    public void depositFunds(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account Number: ");
        int accountNumber = scanner.nextInt();
        if(customerAccountNumber == accountNumber){
            System.out.println("Enter deposit amount: ");
            double cash = scanner.nextInt();
            accountBalance += cash;
            System.out.println("Deposit successful, Your current balance is: " + accountBalance);
        }
    }
}

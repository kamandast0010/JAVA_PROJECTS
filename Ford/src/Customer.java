public class Customer{
    private String customerName;
    private double creditLimit;
    private String customerEmail;


    public String getCustomerName(){
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Customer(String customerName,double creditLimit,String customerEmail){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
//        System.out.println("CustomerName:" + customerName + "\nCustomerEmail: " + customerEmail + "\nCreditLimit: " + creditLimit);
    }

    public Customer(){
        this("Ford",200.00,"ford@gmail.com");
        System.out.println("Default constructor...");
    }

    public Customer(String customerName,String customerEmail){
        this("Sullaiman Kamanda",300.00,"sullaimankamanda9@gmail.com");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
//        System.out.println("CustomerName:" + customerName + "\nCustomerEmail: " + customerEmail + "\nCreditLimit: " + creditLimit);

    }
}

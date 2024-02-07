public class Main {
    public static void main(String[] args) {
        // created three instances to implement different functionalities the bank can perform like, withdraw funds
        //deposit funds,register a new user,and display information about staff
        Customers user = new Customers();
        //user can withdraw money from the bank
        System.out.println("-------------------user1--------------------");
        user.setAccountBalance(200000);
        user.withdrawFunds(true);

        //user can depositi funds in the bank
        Customers user2 = new Customers();
        System.out.println("-------------------user2--------------------");
        user.depositFund();

        //user3 register/open an account to the bank
        Customers user3 = new Customers();
        System.out.println("-------------------user3--------------------");
        user.registerUser();

        //implemented an arraylist to hold the names of staff in the bank
        Staff staffInfo = new Staff();
        System.out.println("----------------------------staff Names--------------------------------");
        staffInfo.staff();


    }
}

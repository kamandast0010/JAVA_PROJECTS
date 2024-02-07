public class Main {
    public static void main(String[] args) {
    Employee ford = new Employee("Sullaiman Kamanda","1996-09-13",1979,"2023-11-16");
        Employee sul = new Employee("Sullaiman Turay","1996-09-16",1979,"2023-11-16");
        System.out.println(ford.toString());
    }
}
    class SalariedEmployee extends Worker{
        private double annualSalary;
         private boolean isRetired;
         public void retire(){

         }

        @Override
        public int getAge(int currentYear, int birthYear, int age) {
            return super.getAge(currentYear, birthYear, age);
        }

        @Override
        public double collectPay(double salary) {
            return super.collectPay(salary);
        }
    }


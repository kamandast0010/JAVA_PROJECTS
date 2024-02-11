import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Carlos Rodriguez", false,
                new Companies(1, "Apple", "EEUU", 300));
        Employee employee2 = new Employee(2, "Fernando Suarez", true,
                new Companies(null));
        Employee employee3 = new Employee(3, "Sergio Fernandez", false,
                new Companies(3, "Android", "Canada", 100));
        Employee employee4 = new Employee(4, "Pablo Plasencia", false,
                new Companies(4, "Preving", "Spain", 1500));
        Employee employee5 = new Employee(5, "Emmanuel Seguro", false,
                new Companies(5, "Preving", "Spain", 1500));

        ArrayList<Employee> employeesDomain = new ArrayList<>();
        employeesDomain.add(employee1);
        employeesDomain.add(employee2);
        employeesDomain.add(employee3);
        employeesDomain.add(employee4);
        employeesDomain.add(employee5);

//        System.out.println(employeesDomain);
        for (Employee employees : employeesDomain) {
            System.out.println(employees);
            if (!employees.isUnEmployed()) {
                System.out.println(employees);
            }
            if (employees.getCompany().getEmployees() > 500) {
                System.out.println(employees);
            }if(employees.getCompany().getName() == "Preving"){
                System.out.println(employees);
            }if(employees.getCompany().getId() ==2){
                employee2 = new Employee(2,"Fernando Suarez",true,
                        new Companies(2,"Apple","USA",400));
                employeesDomain.add(employee2);
                System.out.println(employees);
            }
        }


    }
}

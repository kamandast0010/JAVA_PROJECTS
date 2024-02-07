public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
//        this.endDate = endDate;
    }


    public int getAge(int currentYear,int birthYear,int age){
        return age = currentYear - birthYear;
    }
    public double collectPay(double salary){
        return salary;
    }
    public String terminate(String endDate){
        return endDate;
    }

    @Override
    public String toString() {
        return "Worker:" +
                "name=" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\''
                ;
    }
}

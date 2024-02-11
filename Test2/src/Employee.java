public class Employee{
    private int id;
    private String name;
    private boolean unEmployed;
    private Companies company;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public boolean isUnEmployed() {
        return unEmployed;
    }

    public Companies getCompany() {
        return company;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnEmployed(boolean unEmployed) {
        this.unEmployed = unEmployed;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }
    public Employee(){}

    public Employee(int id, String name, boolean unEmployed, Companies company) {
        this.id = id;
        this.name = name;
        this.unEmployed = unEmployed;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unEmployed=" + unEmployed +
                ", company=" + company +
                '}';
    }
}

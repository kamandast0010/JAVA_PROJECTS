public class Companies {
    private int id;
    private String name;
    private String Country;
    private int employees;

    public Companies(Object o) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public Companies(){

    }

    public Companies(int id, String name, String country, int employees) {
        this.id = id;
        this.name = name;
        Country = country;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Country='" + Country + '\'' +
                ", employees=" + employees +
                '}';
    }
}

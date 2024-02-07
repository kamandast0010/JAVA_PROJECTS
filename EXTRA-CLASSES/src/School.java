import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class School{
    //attributes declaration
    private String schoolName;
    private String schoolAddress;
    private List<String> schoolDepartment = new ArrayList<String>();
    private String schoolCode;
    private String schoolType;
    protected int numberOfStudents;
    protected int numberOfStaff;

    public School(){

    }

    public School(String schoolName, String schoolAddress, List<String> schoolDepartment, String schoolCode, String schoolType, int numberOfStudents, int numberOfStaff) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolDepartment = schoolDepartment;
        this.schoolCode = schoolCode;
        this.schoolType = schoolType;
        this.numberOfStudents = numberOfStudents;
        this.numberOfStaff = numberOfStaff;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public String getSchoolAddress() {
        return schoolAddress;
    }

    public List<String> getSchoolDepartment() {
        return schoolDepartment;
    }
    public String getSchoolCode() {
        return schoolCode;
    }
    public String getSchoolType() {
        return schoolType;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolDepartment=" + schoolDepartment +
                ", schoolCode='" + schoolCode + '\'' +
                ", schoolType='" + schoolType + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", numberOfStaff=" + numberOfStaff +
                '}';
    }

    //behaviours or methods
    public void schoolEnroll(){
        String sdepartment;
        int studentId;
        String studentName;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        studentName = scan.nextLine();
        System.out.println("Enter Student Id: ");
        studentId = scan.nextInt();
        System.out.println("Enter Student Department: ");
        sdepartment = scan.nextLine();
        System.out.println("Name : " + studentName + "\n Id : " + studentId + "\n Department : " + sdepartment);
    }
    public int getSchoolPopulation(){
        return numberOfStaff + numberOfStudents;
    }

}

class Student extends School {
    private String gender;
    private int studentAge;
    private List<String> parentGurdians = new ArrayList<String>();

    public Student(){

    }

    public Student(String schoolName, String schoolAddress, List<String> schoolDepartment, String schoolCode, String schoolType,
                   int numberOfStudents, int numberOfStaff, String gender, int studentAge, List<String> parentGurdians) {
        super(schoolName, schoolAddress, schoolDepartment, schoolCode, schoolType, numberOfStudents, numberOfStaff);
        this.gender = gender;
        this.studentAge = studentAge;
        this.parentGurdians = parentGurdians;
    }

    @Override
    public int getSchoolPopulation(){
        return numberOfStudents;
    }
}

class Staff extends School{
    private String nameOfStaff;
    private int staffId;


    public Staff(String schoolName, String schoolAddress, List<String> schoolDepartment, String schoolCode,
                 String schoolType, int numberOfStudents, int numberOfStaff, String nameOfStaff, int staffId) {
        super(schoolName, schoolAddress, schoolDepartment, schoolCode, schoolType, numberOfStudents, numberOfStaff);
        this.nameOfStaff = nameOfStaff;
        this.staffId = staffId;
    }

    @Override
    public int getSchoolPopulation(){
        return numberOfStaff;
    }
}

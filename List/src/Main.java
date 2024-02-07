import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Sullaiman",23,"Fallah Kamanda"));
        student.add(new Student("Mariama",27,"Abdul Kamara"));
        student.add(new Student("Edith",18,"Sorie Sesay"));

        for (Student student1: student) {
            System.out.println("Name: " + student1.name + " Age: " + student1.age + " Parent/Gurdian: "+ student1.getParentOrGurdian());
        }



//        Scanner studInfo = new Scanner(System.in);
//        Scanner studInfo2 = new Scanner(System.in);
//        Scanner studInfo3 = new Scanner(System.in);
//
//        System.out.println("Enter Name: ");
//        String name = studInfo.nextLine();
//        System.out.println("Enter Age: ");
//        int age = studInfo.nextInt();
//
//        System.out.println("Enter Name2: ");
//        String name2 = studInfo2.nextLine();
//        System.out.println("Enter Age2: ");
//        int age2 = studInfo.nextInt();
//
//        System.out.println("Enter Name3: ");
//        String name3 = studInfo3.nextLine();
//        System.out.println("Enter Age3: ");
//        int age3 = studInfo.nextInt();
//
//        ArrayList<Student> student = new ArrayList<>();
//        student.add(new Student(name,age));
//        student.add(new Student(name2,age2));
//        student.add(new Student(name3,age3));

//        for(Student stud : student){
//            System.out.println("Name: "+ stud.name + " " + "Age: "+ stud.age);
//        }

    }
}

class Student{
    public String name;
    public int age;
    private String parentOrGurdian;

    public String getParentOrGurdian(){
        return parentOrGurdian;
    }

    public Student(String name,int age,String parentOrGurdian){
        this.parentOrGurdian = parentOrGurdian;
        this.name = name;
        this.age = age;
    }
}

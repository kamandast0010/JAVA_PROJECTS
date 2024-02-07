public class Cat2 extends Animal2{
    public String name;
    public double height;

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void getDetails(){
        System.out.println("Name :" + name );
        System.out.println("Height :" + height );
    }
}

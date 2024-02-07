public class Dog{
    private String name;
   private double height;
   private String color;

   public String getName(){
       return  name;
   }

   public double getHeight(){
       return height;
   }
   public String getColor(){
       return color;
   }
    public void bark(){
        System.out.println("Barking....");
    }
    public void run(){
        System.out.println("Running...");
    }
}

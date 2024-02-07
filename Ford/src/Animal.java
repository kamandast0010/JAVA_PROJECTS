public class Animal{
    private String name;
    private String color;
    private int age;


    public Animal(String name,String color,int age){
        this.age = age;
        this.color = color;
        this.name = name;
    }
    public String animalSound(String sound){
        return sound;
    }
    public void makeNoise(){
        System.out.println("Animal Making noise....");
    }

    public String getName(String name){
        return name;
    }
    public String getColor(String color){
        return color;
    }
    public int getAge(int age){
        return age;
    }



}

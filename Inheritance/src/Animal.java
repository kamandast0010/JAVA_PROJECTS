public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(String type,String size,double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal() {

    }
    public void animalDetails(){
        System.out.println("Animal type :" + type + "-- AnimalSize :"+ size + "-- AnimalWeight: " + weight);
    }

    public void move(String speed){
        System.out.println(type + " move " + speed);
    }
    public void makeNoise(){
        System.out.println(type + "  Make noise "  );
    }

}

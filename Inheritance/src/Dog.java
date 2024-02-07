public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Remi","small",50.00);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,weight < 15 ? "small" : (weight < 35? "mwedium":"large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void bark(){
        System.out.println("Woof wooof");
    }
    public boolean isRunning(boolean isRunning){
        if(isRunning){
            return true;
        }else return false;
    }

}

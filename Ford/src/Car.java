public class Car{
    private String make = " Tesla";
    private String model = "Model y";
    private String color = "Black";
    private int doors = 2;
    private boolean convertible = true;


    public String getColor(){
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public void setMake(String make){
        switch(make){
            case "Porsche","Benz","Tesla" -> this.make = make;
            default -> this.make = "Not Valid!!";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-doors \n" +
                "Color: "+ color + " \n" +
                "Make: "+ make + " \n" +
                "Model: "+ model + " \n" +
                (convertible ? "Yes" : ""));
    }
}

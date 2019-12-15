public class Americano extends Beverage {//role: concreteComponent

    public Americano(){}

    @Override
    public String getDescription(){
        return "Americano";
    }

    @Override
    public int getCost(){
        return 4;
    }
}

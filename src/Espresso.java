public class Espresso extends Beverage {//role: concreteComponent

    public Espresso(){}

    @Override
    public int getCost() {
        return 2;
    }

    public String getDescription(){
        return "Espresso";
    }
}

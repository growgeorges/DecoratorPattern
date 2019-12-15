public class MilkExtra extends ExtrasDecorator {//role: concreteDecorator

    public MilkExtra(Beverage baseBeverage) {
        super(baseBeverage);
    }

    public String getDescription(){
        return baseBeverage.getDescription() + " + Milk";
    }

    public int getCost(){
        return baseBeverage.getCost() + 1;
    }
}

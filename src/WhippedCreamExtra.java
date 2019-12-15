public class WhippedCreamExtra extends ExtrasDecorator {//role: concreteDecorator

    public WhippedCreamExtra(Beverage baseBeverage) {
        super(baseBeverage);
    }

    public String getDescription(){
        return this.baseBeverage.getDescription() + " + Whipped Cream";
    }

    public int getCost(){
        return this.baseBeverage.getCost() + 2;
    }
}

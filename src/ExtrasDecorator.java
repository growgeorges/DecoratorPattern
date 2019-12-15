public class ExtrasDecorator extends Beverage {//role: decorator
    Beverage baseBeverage;

    public ExtrasDecorator(Beverage baseBeverage){
        this.baseBeverage = baseBeverage;
    }
}
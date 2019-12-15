public class Main {//role: client

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " : " + espresso.getCost());//result: Espresso : 2

        Beverage espressoWithCream = new WhippedCreamExtra(espresso);
        System.out.println(espressoWithCream.getDescription() + " : " + espressoWithCream.getCost()); //result: Espresso + Whipped Cream : 4

        Beverage espressoWithCreamAndMilk = new MilkExtra(espressoWithCream);
        System.out.println(espressoWithCreamAndMilk.getDescription() + " : " + espressoWithCreamAndMilk.getCost());// result: Espresso + Whipped Cream + Milk : 5

        Beverage espressoWithCreamAndMilkPlusExtraCream = new WhippedCreamExtra(espressoWithCreamAndMilk);
        System.out.println(espressoWithCreamAndMilkPlusExtraCream.getDescription() + " : " + espressoWithCreamAndMilkPlusExtraCream.getCost());//result: Espresso + Whipped Cream + Milk + Whipped Cream : 7
    }
}

public class Espresso extends Coffee{

    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding the espresso beans finely...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing the espresso under high pressure…");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("You asked for " + numberOfShots + " servings! Every serving of Espresso costs "+ price +"$. Your total bill is "+ numberOfShots * price+ "$");
    }


}

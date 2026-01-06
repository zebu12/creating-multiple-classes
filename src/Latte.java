public class Latte extends Coffee{

    String milkType;

    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }


    @Override
    public void grindBeans() {
        System.out.println("Grinding coffee beans coarsely for a latte "+ roast);
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing coffee beans coarsely for a latte");
        if(!syrupFlavor.equals("no")){
            System.out.println("Adding "+ syrupFlavor + "syrup to the cup...");
        }
        System.out.println("Steaming "+ milkType +" milk ...");
        System.out.println("Combining coffee and steaming milk ...");

        System.out.println("Adding a layer of foam on top...");


    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Your latte has "+milkType+" and "+syrupFlavor+". Your total bill is "+price+"$");


    }


}

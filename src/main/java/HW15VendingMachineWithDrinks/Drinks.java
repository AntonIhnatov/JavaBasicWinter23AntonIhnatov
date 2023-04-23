package HW15VendingMachineWithDrinks;

enum DrinksMachine {
    COFFEE,
    TEA,
    LEMONADE,
    MOJITO,
    MINERAL_WATER,
    COCA_COLA

}
public class Drinks {
    private static final double COFFEE_PRICE = 1.5;
    private static final double TEA_PRICE = 1.0;
    private static final double LEMONADE_PRICE = 1.3;
    private static final double MOJITO_PRICE = 2.3;
    private static final double MINERAL_WATER_PRICE = 0.8;
    private static final double COCA_COLA_PRICE = 1.4;
    private static double totalPrice = 0.0;
    private static int totalDrinks = 0;

    public static void cookDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Making coffee");
                break;
            case TEA:
                System.out.println("Making tea");
                break;
            case LEMONADE:
                System.out.println("Making lemonade");
                break;
            case MOJITO:
                System.out.println("Making mojito");
                break;
            case MINERAL_WATER:
                System.out.println("Making mineral water");
                break;
            case COCA_COLA:
                System.out.println("Making Coca Cola");
                break;
            default:
                System.out.println("Invalid drink choice");
        }
        totalDrinks++;
    }

    public static void calcTotalAmount(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                totalPrice += COFFEE_PRICE;
                break;
            case TEA:
                totalPrice += TEA_PRICE;
                break;
            case LEMONADE:
                totalPrice += LEMONADE_PRICE;
                break;
            case MOJITO:
                totalPrice += MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                totalPrice += MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                totalPrice += COCA_COLA_PRICE;
                break;
        }
    }

    public static void totalInfo() {
        System.out.println("Total drinks: " + totalDrinks);
        System.out.print("Total price: ");
        System.out.format("%.2f",totalPrice);
        System.out.print("$");
    }
}


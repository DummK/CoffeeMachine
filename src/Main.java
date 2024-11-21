interface CoffeeMachine {
    void prepareCoffee();
}

abstract class BaseCoffee implements CoffeeMachine {
    int water;
    int coffeePortion;
    int milk;

    public BaseCoffee(int water, int coffeePortion, int milk) {
        this.water = water;
        this.coffeePortion = coffeePortion;
        this.milk = milk;
    }
}

class Espresso extends BaseCoffee {
    public Espresso(int water, int coffeePortion, int milk) {
        super(water, coffeePortion, milk);

    }

    public void prepareCoffee() {
        System.out.println("Robie " + coffeePortion + " Espresso w proporcjach: ");
        System.out.println("Woda: " + water);
        System.out.println("Mleko: " + milk);
    }
}

class Latte extends BaseCoffee {
    public Latte(int water, int coffeePortion, int milk) {
        super(water, coffeePortion, milk);
    }

    public void prepareCoffee() {
        System.out.println("Robie " + coffeePortion + " Latte w proporcjach: ");
        System.out.println("Woda: " + water);
        System.out.println("Mleko: " + milk);
    }
}

class Cappuccino extends BaseCoffee {
    public Cappuccino(int water, int coffeePortion, int milk) {
        super(water, coffeePortion, milk);
    }

    public void prepareCoffee() {
        System.out.println("Robie " + coffeePortion + " cappuccino w proporcjach: ");
        System.out.println("Woda: " + water);
        System.out.println("Mleko: " + milk);
    }
}

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso(50, 1, 0);
        Latte latte = new Latte(50, 1, 200);
        Cappuccino cappuccino = new Cappuccino(50, 1, 100);

        espresso.prepareCoffee();
        latte.prepareCoffee();
        cappuccino.prepareCoffee();
    }
}
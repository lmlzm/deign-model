package factoryMethod;

/**
 * @className CoffeeStorm
 * @description 咖啡店
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class CoffeeStorm {

    private CoffeeFactory coffeeFactory;

    public CoffeeStorm(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee buyCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        return coffee;
    }

    public static void main(String[] args) {
        CoffeeStorm coffeeStorm = new CoffeeStorm(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStorm.buyCoffee();
        System.out.println(coffee.getName());
    }
}

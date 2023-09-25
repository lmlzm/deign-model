package factory;

/**
 * @className Test
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        Coffee latte = coffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}

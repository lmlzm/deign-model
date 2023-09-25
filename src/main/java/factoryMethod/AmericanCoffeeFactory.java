package factoryMethod;

/**
 * @className AmericanCoffeeFactory
 * @description 美式咖啡工厂
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}

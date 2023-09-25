package factoryMethod;

/**
 * @className LatteCoffeeFactory
 * @description 拿铁咖啡工厂
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }


}

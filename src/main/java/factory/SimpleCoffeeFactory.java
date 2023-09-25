package factory;

/**
 * @className SimpleCoffeeFactory
 * @description 简单咖啡工厂
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}

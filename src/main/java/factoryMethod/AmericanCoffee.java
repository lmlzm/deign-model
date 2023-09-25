package factoryMethod;

/**
 * @className AmericanCoffee
 * @description 美式咖啡
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class AmericanCoffee implements Coffee {
    @Override
    public String getName() {
        return "AmericanCoffee";
    }

    @Override
    public void addMilk() {
        System.out.println("美式咖啡加奶");

    }

    @Override
    public void addSugar() {
        System.out.println("美式咖啡加糖");
    }

}

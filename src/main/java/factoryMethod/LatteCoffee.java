package factoryMethod;

/**
 * @className LatteCoffee
 * @description 拿铁咖啡
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public class LatteCoffee implements Coffee {
    @Override
    public String getName() {
        return "LatteCoffee";
    }

    @Override
    public void addMilk() {
        System.out.println("拿铁咖啡加奶");
    }

    @Override
    public void addSugar() {
        System.out.println("拿铁咖啡加糖");
    }
}

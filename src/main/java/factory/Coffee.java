package factory;

/**
 * @interfaceName Coffee
 * @description 咖啡类
 * @author: LM理智梦
 * @date: 2023/9/21
 * @version: 1.0
 */
public interface Coffee {

    /**
     * 获取咖啡名称
     */
    String getName();

    /**
     * 加奶
     */
    void addMilk();

    /**
     * 加糖
     */
    void addSugar();
}

package cn.tedu.java;

/**
 * 单例模式 懒汉式
 */
public class Order {
    private Order(){}
    private static Order order = null;

    public static Order getOrder() {
        if (order == null){
            order = new Order();
        }
        return order;
    }
}

package cn.tedu.java;

/**
 * 单例模式 饿汉式
 */
public class Bank {
    private Bank(){}
    private static Bank bank = new Bank();

    public static Bank getBank() {
        return bank;
    }
}

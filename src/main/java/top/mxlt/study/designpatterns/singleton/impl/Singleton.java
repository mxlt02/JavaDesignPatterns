package top.mxlt.study.designpatterns.singleton.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/26
 */
public class Singleton {

    // Config
    public static SingletonEnum singletonEnum = SingletonEnum.HUNGRY;

    /**
     * 1.创建自己的静态私有实例
     */
    private static Singleton instance = singletonEnum == SingletonEnum.HUNGRY ? new Singleton() : null;

    /**
     * 2.私有构造函数使其无法被其他类创建实例
     */
    private Singleton() {
    }

    /**
     * 3.提供一个公开获取实例的函数
     */
    public static Singleton getInstance() {
        if (singletonEnum == SingletonEnum.LAZYSYNC) {
            return getInstanceSync();
        } else if (singletonEnum == SingletonEnum.LAZY && instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 3.1.提供一个公开获取实例的函数, 多线程安全版本
     */
    private static synchronized Singleton getInstanceSync() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

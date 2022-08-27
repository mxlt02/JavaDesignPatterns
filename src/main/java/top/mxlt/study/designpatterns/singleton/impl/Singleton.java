package top.mxlt.study.designpatterns.singleton.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/26
 *
 * 注意: 实际使用请采用一种方式即可, 请不要学习本类的过度集成, 本类仅适合于需要配置加载模式的情况
 */
public class Singleton {

    // Config 推荐使用LAZYBETTERSYNC
    public static final SingletonEnum singletonEnum = SingletonEnum.LAZYBETTERSYNC;

    /**
     * 1.创建自己的静态私有实例
     */
    private static volatile Singleton instance = singletonEnum == SingletonEnum.HUNGRY ? new Singleton() : null;

    /**
     * 2.私有构造函数使其无法被其他类创建实例
     */
    private Singleton() {
    }

    /**
     * 3.提供一个公开获取实例的函数
     */
    public static Singleton getInstance() {
        if (singletonEnum == SingletonEnum.LAZYBETTERSYNC){
            return getInstanceBetterSync();
        }else if (singletonEnum == SingletonEnum.LAZYSYNC) {
            return getInstanceSync();
        } else if (singletonEnum == SingletonEnum.LAZY && instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 3.1.提供一个公开获取实例的函数, 多线程安全版本
     */
    private static Singleton getInstanceSync() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // 双重检测锁 (Double-Checked Lock，DCL)
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * 4.提供一个静态内部类, 多线程安全版本且易用版本, 开源项目多见
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 4.1.提供一个公开获取实例的函数, 多线程安全版本且易用版本, 开源项目多见
     */
    private static Singleton getInstanceBetterSync() {
        return SingletonHolder.INSTANCE;
    }
}

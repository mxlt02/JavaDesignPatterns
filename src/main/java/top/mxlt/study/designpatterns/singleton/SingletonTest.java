package top.mxlt.study.designpatterns.singleton;

import top.mxlt.study.designpatterns.singleton.impl.Singleton;
import top.mxlt.study.designpatterns.singleton.impl.SingletonEnum;

import java.util.concurrent.TimeUnit;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/26
 */
public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        Singleton.singletonEnum = SingletonEnum.LAZY;
        System.out.println("Config singletonEnum-> "+ Singleton.singletonEnum);

        System.out.println("开始运行, 睡眠3秒测试");
        // TimeUnit.SECONDS.sleep(3);

        // Singleton singleton = new Singleton();
        // 'Singleton()' has private access in 'top.mxlt.study.designpatterns.singleton.impl.Singleton'
        // 你不能自己创建实例了, 需要调用单例对象的获取实例函数
        Singleton instance = Singleton.getInstance();
        System.out.println("1-> "+instance.toString());
        Singleton instance1 = Singleton.getInstance();
        System.out.println("2-> "+instance1.toString());
        System.out.println("3-> "+ (instance == instance1));

        // 输出结果, 我们可以看出是同一个对象
        // 1-> top.mxlt.study.designpatterns.singleton.impl.Singleton@7ef20235
        // 2-> top.mxlt.study.designpatterns.singleton.impl.Singleton@7ef20235
        // 3-> true
    }
}

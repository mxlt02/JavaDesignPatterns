package top.mxlt.study.designpatterns.singleton.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/26
 *
 * HUNGRY 饿汉式, 类加载时就初始化
 *  是否线程安全: 是
 *  优点: 启动时慢, 运行效率高
 *  缺点: 有可能出现一次也不调用的单例对象, 却急着创建实例, 占用浪费内存, 如遇大型对象可导致启动程序时间过长
 * LAZY 懒汉式, 首次调用才创建实例
 *  是否线程安全: 否
 *  优点: 节省内存, 程序启动快
 *  缺点: 多线程问题, 以及运行期间创建对象, 如遇大型对象可导致运行卡顿
 * LAZYSYNC 线程安全懒汉式
 *  是否线程安全: 是
 *  优点: 多线程问题得以解决
 *  缺点: 加锁会在一定程度上影响性能
 */
public enum SingletonEnum {
    HUNGRY,LAZY,LAZYSYNC
}

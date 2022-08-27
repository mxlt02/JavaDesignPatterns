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
 *  缺点: 可能因为多线程安全会在一定程度上影响细微的性能
 * LAZYBETTERSYNC 通过静态内部类实现的线程安全懒汉式 (推荐)
 *  是否线程安全: 是
 *  优点: 通过静态内部类实现懒加载,并利用类装载的机制来保证初始化实例时只有一个线程, 没没有加任何锁的情况下解决多线程问题, 且效率高
 *  缺点: 原理较难理解, 但推荐使用
 */
public enum SingletonEnum {
    HUNGRY,LAZY,LAZYSYNC,LAZYBETTERSYNC
}

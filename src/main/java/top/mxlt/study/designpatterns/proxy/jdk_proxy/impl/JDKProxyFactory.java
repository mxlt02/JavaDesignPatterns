package top.mxlt.study.designpatterns.proxy.jdk_proxy.impl;

import top.mxlt.study.designpatterns.proxy.SellTickets;
import top.mxlt.study.designpatterns.proxy.TrainStation;

import java.lang.reflect.Proxy;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 *
 * JDKProxy实际上是代理的接口类
 */
public class JDKProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getSellTicketsObject() {
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDKProxyFactory:invoke:before");
            Object invoke = method.invoke(trainStation, args);
            System.out.println("JDKProxyFactory:invoke:after");
            return invoke;
        });
        return sellTickets;
    }
}

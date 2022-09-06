package top.mxlt.study.designpatterns.proxy.static_proxy;

import top.mxlt.study.designpatterns.proxy.static_proxy.impl.TrainStationProxy;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        TrainStationProxy trainStationProxy = new TrainStationProxy();
        trainStationProxy.sell();
    }
}

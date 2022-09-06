package top.mxlt.study.designpatterns.proxy.static_proxy.impl;

import top.mxlt.study.designpatterns.proxy.SellTickets;
import top.mxlt.study.designpatterns.proxy.TrainStation;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 */
public class TrainStationProxy implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("TrainStationProxy:sell:before");
        trainStation.sell();
        System.out.println("TrainStationProxy:sell:after");
    }
}

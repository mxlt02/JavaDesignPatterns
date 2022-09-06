package top.mxlt.study.designpatterns.proxy;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("TrainStation:sell");
    }
}

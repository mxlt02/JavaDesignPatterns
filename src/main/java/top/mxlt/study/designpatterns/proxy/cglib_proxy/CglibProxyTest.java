package top.mxlt.study.designpatterns.proxy.cglib_proxy;

import top.mxlt.study.designpatterns.proxy.TrainStation;
import top.mxlt.study.designpatterns.proxy.cglib_proxy.impl.CglibProxyFactory;
import top.mxlt.study.designpatterns.proxy.cglib_proxy.impl.CglibTrainStation;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 *
 * Warning: 在JDK9以后反射默认是不允许使用的, 要想在高版本JDK中让以下代码运行请增加VM参数--add-opens java.base/java.lang=ALL-UNNAMED
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory();
        CglibTrainStation cglibTrainStation = cglibProxyFactory.getTrainStationObject();
        cglibTrainStation.sell();
    }
}

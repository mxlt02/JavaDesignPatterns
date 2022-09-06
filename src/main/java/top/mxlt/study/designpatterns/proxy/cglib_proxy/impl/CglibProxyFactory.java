package top.mxlt.study.designpatterns.proxy.cglib_proxy.impl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import top.mxlt.study.designpatterns.proxy.TrainStation;

import java.lang.reflect.Method;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 *
 * JDK的Proxy类必须有个接口, 当没有接口时可以使用CGLIB
 */
public class CglibProxyFactory implements MethodInterceptor {

    private CglibTrainStation cglibTrainStation = new CglibTrainStation();

    public CglibTrainStation getTrainStationObject() {
        //创建CGLib的Enhancer对象, 类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(CglibTrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        CglibTrainStation cglibTrainStation = (CglibTrainStation) enhancer.create();
        return cglibTrainStation;

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CglibProxyFactory:intercept:before");
        Object invoke = method.invoke(cglibTrainStation, objects);
        System.out.println("CglibProxyFactory:intercept:after");
        return invoke;
    }
}
